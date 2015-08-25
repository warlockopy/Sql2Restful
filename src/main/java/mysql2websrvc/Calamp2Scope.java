package mysql2websrvc;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

import org.apache.commons.codec.binary.Base64;

import scopeProto.*;
import scopeProto.BatteryLowProto.BatteryLow;
import scopeProto.EngineStartProto.EngineStart;
import scopeProto.EngineStopProto.EngineStop;
import scopeProto.EventHeaderProto.EventHeader;
import scopeProto.ExcessiveIdleProto.ExcessiveIdle;
import scopeProto.GeneralStatusTypeProto.GeneralStatusType;
import scopeProto.MainPowerHighProto.MainPowerHigh;
import scopeProto.MainPowerLowProto.MainPowerLow;
import scopeProto.NonTripPositionProto.NonTripPosition;
import scopeProto.PeriodicPositionProto.PeriodicPosition;
import scopeProto.StartOfExcessiveIdleProto.StartOfExcessiveIdle;
import scopeProto.TripShutdownProto.TripShutdown;
import scopeProto.TripStartupProto.TripStartup;
import scopeProto.TripSummaryProto.TripSummary;
import mysql2websrvc.ScopePrototypes.*;

import com.google.gson.Gson;

import feedback.Success;

public class Calamp2Scope {
	
	static BufferedWriter bw;


	public static int getGeneralStatus(MessageContents message)
	{
		int ans = 0;
		
		//Ignicion
		if (message.getInputs().getIgnition().compareTo("on") == 0) {
			ans |= GeneralStatusType.GENERAL_STATUS_IGNITION_VALUE;
			//System.err.println("Ingnicion ON.");
		}
		if (Integer.parseInt(message.getEventCode()) == CalampEventCode.OffMainPower){
			ans |= GeneralStatusType.GENERAL_STATUS_BATTERY_VALUE;
		}
		
		return ans;
	}

	public static Success toScopeString (ArrayList <DataObject> datos) throws ParseException, IOException{
		
		String dateFormat = "yyyyMMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		Calendar calendar = Calendar.getInstance(); // today
		final String filename = "Headers_" + sdf.format(calendar.getTime()) + ".txt";
		
		bw = new BufferedWriter (new FileWriter (filename, true));
		
		//Consideraciones para crear los tiempos.
		long timeAdjust = 4 * 3600;
		Gson gson = new Gson ();
		final SimpleDateFormat sdfu  = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		final Date utc1970 = sdfu.parse("1970-01-01 00:00:00");
		
		ResponsePrototype response = new ResponsePrototype ();
		ArrayList <String> successList = new ArrayList ();
		ArrayList <String> scopeMessageList = new ArrayList ();
		int calampEventCode;
		EventHeader commonHeader;
		int itemsToSend = 0;
		
		for (DataObject arrayElement : datos){
			
			String successCode = "unknown report";
			MessagesPostPrototype message = new MessagesPostPrototype ();
			MessageContents calampMessage = arrayElement.getMessageContents();
			calampEventCode = Integer.parseInt(calampMessage.getEventCode());
			Date udate = sdfu.parse(calampMessage.getTimeOfFix());
			
			String unitId = arrayElement.getOptionsHeader().getMobileId();
			
			StringTokenizer stringTokenizer = new StringTokenizer (calampMessage.getSpeed ());
			String speedString = stringTokenizer.nextToken ();
			double speedDouble = Double.parseDouble(speedString);
			ScopeTemplateIdAndDescription idAndDescription = new ScopeTemplateIdAndDescription (calampEventCode);
			
			String description = idAndDescription.getDescription ();
			int direction = Integer.parseInt(calampMessage.getHeading());
			int driverKeyCode = 0;
			int inputStatus = calampMessage.getInputs().toInteger();
			double latitude = Double.parseDouble(calampMessage.getLatitude());
			double longitude = Double.parseDouble(calampMessage.getLongitude());
			int odometer = 0; //Extraer de acumulador
			int outputStatus = 0;
			int speed = (int) speedDouble;
			int templateId = idAndDescription.getTemplateId ();
			long utcTimestampSeconds = (udate.getTime () - utc1970.getTime()) / 1000 + timeAdjust;
			int generalStatus = getGeneralStatus(calampMessage);
			String 	[] accumulatorsString = calampMessage.getAccumulators();
			double accumulators [] = new double [accumulatorsString.length];
			
			for (int i = 0; i < accumulators.length; ++i)
				accumulators [i] = Double.parseDouble(accumulatorsString [i]);
			
			int tripDistanceMeters = 0;
			int tripDurationSeconds = 0;
			int tripIdentifier = 0;
			
			if (accumulators.length >= 1) tripDistanceMeters = (int) accumulators [0];
			if (accumulators.length >= 2) tripDurationSeconds = (int) accumulators [1];
			if (accumulators.length >= 8){
				odometer = (int) accumulators [7] / 1000; //In km
				System.out.println ("---Odometer: " + odometer + " meters.");
			}
			
			commonHeader = EventHeader.newBuilder()
					.setDescription(description)
					.setDirection(direction)
					.setDriverKeyCode(driverKeyCode)
					.setInputStatus(inputStatus)
					.setLatitude(latitude)
					.setLongitude(longitude)
					.setOdometer(odometer)
					.setOutputStatus(outputStatus)
					.setSource(8)
					.setSpeed(speed)
					.setTemplateId(templateId)
					.setUnitId(unitId)
					.setUtcTimestampSeconds(utcTimestampSeconds)
					.setGeneralStatus(generalStatus)
					.build ();
					
			message.setTemplateId(templateId);
			message.setUnitId (unitId);
			
			byte [] bytes = null;
			String encodedBody;
			
			//Rechazar eventos con fecha inválida
			/*
			if (calampMessage.getFixStatus ().getInvalidFix ().compareTo("true") == 0){
				templateId = ScopeEventCode.UnknownEvent;
				successCode = "invalid fix";
			}*/
			
			//Mostrar tipo de evento
			if (templateId != ScopeEventCode.UnknownEvent)
				System.err.println ("Scope event " + templateId + " (Calamp event " + 
				calampEventCode + "): " + description);
			
			switch (templateId){
				
				case ScopeEventCode.PeriodicPosition:
					PeriodicPosition periodicPosition = PeriodicPosition
						.newBuilder()
						.setHeader(commonHeader)
						.setTripDistanceMeters(tripDistanceMeters)
						.setTripDurationSeconds(tripDurationSeconds)
						.build ();
					
					bytes = periodicPosition.toByteArray();
					
					break;
					
				case ScopeEventCode.BatteryLow:
					BatteryLow batteryLow = BatteryLow
						.newBuilder()
						.setHeader(commonHeader)
						.build ();
					
					bytes = batteryLow.toByteArray();
					
					break;				
						
				case ScopeEventCode.MainPowerHigh:
					MainPowerHigh mainPowerHigh = MainPowerHigh
						.newBuilder()
						.setHeader(commonHeader)
						.build ();
					
					bytes = mainPowerHigh.toByteArray();
					
					break;
					
				case ScopeEventCode.MainPowerLow:
					MainPowerLow mainPowerLow = MainPowerLow
						.newBuilder()
						.setHeader(commonHeader)
						.build ();
					
					bytes = mainPowerLow.toByteArray();

					break;
					
				case ScopeEventCode.ExcessiveIdle:
					ExcessiveIdle excessiveIdle= ExcessiveIdle
						.newBuilder()
						.setHeader(commonHeader)
						.build ();
					
					bytes = excessiveIdle.toByteArray();
					
					break;
					
				case ScopeEventCode.StartOfExcessiveIdle:
					StartOfExcessiveIdle startOfExcessiveIdle= StartOfExcessiveIdle
						.newBuilder()
						.setHeader(commonHeader)
						.build ();
					
					bytes = startOfExcessiveIdle.toByteArray();
					
					break;
					
				case ScopeEventCode.EngineStart:
					EngineStart engineStart = EngineStart
						.newBuilder()
						.setHeader(commonHeader)
						.build ();
					
					bytes = engineStart.toByteArray();;
					
					break;
					
				case ScopeEventCode.EngineStop:
					EngineStop engineStop = EngineStop
						.newBuilder()
						.setHeader(commonHeader)
						.build ();
					
					bytes = engineStop.toByteArray();
					
					break;
					
				case ScopeEventCode.TripStartup:
					//tripDistance = (int) accumulators [0];
					//tripDuration = (int) accumulators [1];
					tripIdentifier = (int) accumulators [2];
					
					System.err.println ("Trip distance: " + tripDistanceMeters);
					System.err.println ("Trip duration: " + tripDurationSeconds);
					System.err.println ("Trip id: " + tripIdentifier);
					
					TripStartup tripStartup = TripStartup
						.newBuilder()
						.setHeader(commonHeader)
						.setTripId(tripIdentifier)
						.build ();
					
					bytes = tripStartup.toByteArray();
					
					break;
					
				case ScopeEventCode.TripShutdown:
					//tripDistance = (int) accumulators [0];
					//tripDuration = (int) accumulators [1];
					tripIdentifier = (int) accumulators [2];
					
					System.err.println ("Trip distance: " + tripDistanceMeters);
					System.err.println ("Trip duration: " + tripDurationSeconds);
					System.err.println ("Trip id: " + tripIdentifier);
					
					TripShutdown tripShutdown = TripShutdown
						.newBuilder()
						.setHeader(commonHeader)
						.setTripDistanceMeters(tripDistanceMeters)
						.setTripDurationSeconds(tripDurationSeconds)
						.setTripId(tripIdentifier)
						.build();
					
					bytes = tripShutdown.toByteArray();
					
					break;
				
				case ScopeEventCode.NonTripPosition:
					
					NonTripPosition nonTripPosition = NonTripPosition
					.newBuilder()
					.setHeader(commonHeader)
					.build ();
				
					bytes = nonTripPosition.toByteArray();;
					
					break;
					
				default:
					System.err.println ("Unknown Calamp event " + calampEventCode);
			}
			
			if (templateId != ScopeEventCode.UnknownEvent){
				encodedBody = Base64.encodeBase64String(bytes);
				message.setEncodedBody (encodedBody);
				response.addMessage (message);
				//saveHeader (gson.toJson(commonHeader));
				successCode = "sent";
				++itemsToSend;
				scopeMessageList.add(gson.toJson(message));
			}
			
			successList.add(successCode);			
		}
		
		String scopeString = gson.toJson(response);
		System.out.println (scopeString);
		
		if (bw != null) bw.close ();
		
		return new Success (scopeString, scopeMessageList, successList, itemsToSend > 0);

	}
		
	public static void saveHeader (final String hdr) throws IOException{
		bw.write(hdr + "\n\n");
	}

}