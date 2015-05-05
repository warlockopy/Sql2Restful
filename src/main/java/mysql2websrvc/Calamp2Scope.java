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

import mysql2websrvc.ScopePrototypes.*;
import ScopeProtoJava.*;
import ScopeProtoJava.BatteryLowProto.BatteryLow;
import ScopeProtoJava.EngineStartProto.EngineStart;
import ScopeProtoJava.EngineStopProto.EngineStop;
import ScopeProtoJava.EventHeaderProto.EventHeader;
import ScopeProtoJava.ExcessiveIdleProto.ExcessiveIdle;
import ScopeProtoJava.GeneralStatusTypeProto.GeneralStatusType;
import ScopeProtoJava.MainPowerHighProto.MainPowerHigh;
import ScopeProtoJava.MainPowerLowProto.MainPowerLow;
import ScopeProtoJava.PeriodicPositionProto.PeriodicPosition;
import ScopeProtoJava.StartOfExcessiveIdleProto.StartOfExcessiveIdle;
import ScopeProtoJava.TripShutdownProto.TripShutdown;
import ScopeProtoJava.TripStartupProto.TripStartup;
import ScopeProtoJava.TripSummaryProto.TripSummary;

import com.google.gson.Gson;

public class Calamp2Scope {
	
	static BufferedWriter bw;
	
public static String Migrate(ArrayList <DataObject> datos) throws ParseException {
	String jsonstringfinal = "";
	MessageContents calampmsg;
	ScopeEventHeader headertmp = new ScopeEventHeader();
	Gson gson = new Gson ();
	int codigoevento, eventocompleto;
	
	
	ResponsePrototype response = new ResponsePrototype ();

	for (int i=0; i < datos.size(); i++){
		MessagesPostPrototype msgtmp = new MessagesPostPrototype ();
		calampmsg = datos.get(i).getMessageContents();
		codigoevento = Integer.parseInt(calampmsg.getEventCode());
		eventocompleto = 0;
						
		SimpleDateFormat sdfu  = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
	    Date udate = sdfu.parse(calampmsg.getTimeOfFix());
	    
	    long timeInMillisSinceEpoch123 = udate.getTime(); 
	    long durationinSeconds2 = timeInMillisSinceEpoch123 / 1000;
		headertmp.UtcTimestampSeconds = durationinSeconds2;
		
		headertmp.Latitude = Double.parseDouble(calampmsg.getLatitude());
		headertmp.Longitude = Double.parseDouble(calampmsg.getLongitude());
		
		StringTokenizer st = new StringTokenizer (calampmsg.getSpeed ());
		headertmp.Speed = (int) Double.parseDouble (st.nextToken ());
		
		headertmp.Direction = Integer.parseInt(calampmsg.getHeading());
		headertmp.Odometer = 0;
		
		int bit0 = calampmsg.getInputs().getIgnition().compareTo("on") == 0 ? 1 : 0;
		int bit1 = calampmsg.getInputs().getInput1().compareTo("on") == 0 ? 1 : 0;
		int bit2 = calampmsg.getInputs().getInput2().compareTo("on") == 0 ? 1 : 0;
		int bit3 = calampmsg.getInputs().getInput3().compareTo("on") == 0 ? 1 : 0;
		int bit4 = calampmsg.getInputs().getInput4().compareTo("on") == 0 ? 1 : 0;
		int bit5 = calampmsg.getInputs().getInput5().compareTo("on") == 0 ? 1 : 0;
		int bit6 = calampmsg.getInputs().getInput6().compareTo("on") == 0 ? 1 : 0;
		int bit7 = calampmsg.getInputs().getInput7().compareTo("on") == 0 ? 1 : 0;
		
		headertmp.InputStatus = (bit7 << 7) + (bit6 << 6) + (bit5 << 5) + (bit4 << 4)
				        + (bit3 << 3) + (bit2 << 2) + (bit1 << 1) + bit0;
		
		
		//Forzar codigo de evento
		codigoevento = CalampEventCode.NonTripPosition;
		
		//headertmp.OutputStatus = 
		switch (codigoevento){
			case CalampEventCode.NonTripPosition:
				
				
				String unitid = datos.get(i).getOptionsHeader().getMobileId(); 
				headertmp.UnitId = unitid;
				msgtmp.setUnitId(unitid);
				headertmp.Source = 0;
				headertmp.TemplateId = 6;
				msgtmp.setTemplateId(6);
				headertmp.Description = "NonTripPosition";
				//perpostmp.header.copyHeader (headertmp);
				//ScopePeriodicPosition perpostmp = new ScopePeriodicPosition ();
				//perpostmp.setHeader(headertmp);
				//perpostmp.header.UnitId = headertmp.UnitId;
				
				
				ScopeNonTripPosition ntp = new ScopeNonTripPosition ();
				ntp.setHeader(headertmp);
				//msgtmp.setBody(perpostmp);
				msgtmp.setBody (ntp);
				eventocompleto = 1;
				break;
			default:
				System.out.println ("-----------------------------");
				System.out.println ("Evento no encontrado : " + codigoevento);
				System.out.println ("-----------------------------");
				break;			
		}
		
		
		if (eventocompleto == 1) response.addMessage(msgtmp);
		
	}
	
	jsonstringfinal = gson.toJson (response);
	
	return jsonstringfinal;
}
public static String MigrateBackup(ArrayList <DataObject> datos) throws ParseException {
	String jsonstringfinal = "";
	ScopePeriodicPosition perpostmp = new ScopePeriodicPosition ();
	MessageContents calampmsg;
	ScopeEventHeader headertmp;
	Gson gson = new Gson ();
	int codigoevento;
	
	ResponsePrototype response = new ResponsePrototype ();

	for (int i=0; i < datos.size(); i++){
		MessagesPostPrototype msgtmp = new MessagesPostPrototype ();
		calampmsg = datos.get(i).getMessageContents();
		codigoevento = Integer.parseInt(calampmsg.getEventCode());
		
		String unitid = datos.get(i).getOptionsHeader().getMobileId(); 
		perpostmp.header.UnitId = unitid;
		msgtmp.setUnitId(unitid);
		msgtmp.setTemplateId(1);
		perpostmp.header.Description = "PeriodicPosition";
		
		SimpleDateFormat sdfu  = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
	    Date udate = sdfu.parse(calampmsg.getTimeOfFix());
	    
	    long timeInMillisSinceEpoch123 = udate.getTime(); 
	    long durationinSeconds2 = timeInMillisSinceEpoch123 / 1000;
		perpostmp.header.UtcTimestampSeconds = durationinSeconds2;
		
		perpostmp.header.Latitude = Double.parseDouble(calampmsg.getLatitude());
		perpostmp.header.Longitude = Double.parseDouble(calampmsg.getLongitude());
		
		StringTokenizer st = new StringTokenizer (calampmsg.getSpeed ());
		perpostmp.header.Speed = (int) Double.parseDouble (st.nextToken ());
		
		perpostmp.header.Direction = Integer.parseInt(calampmsg.getHeading());
		perpostmp.header.Odometer = 0;
		
		int bit0 = calampmsg.getInputs().getIgnition().compareTo("on") == 0 ? 1 : 0;
		int bit1 = calampmsg.getInputs().getInput1().compareTo("on") == 0 ? 1 : 0;
		int bit2 = calampmsg.getInputs().getInput2().compareTo("on") == 0 ? 1 : 0;
		int bit3 = calampmsg.getInputs().getInput3().compareTo("on") == 0 ? 1 : 0;
		int bit4 = calampmsg.getInputs().getInput4().compareTo("on") == 0 ? 1 : 0;
		int bit5 = calampmsg.getInputs().getInput5().compareTo("on") == 0 ? 1 : 0;
		int bit6 = calampmsg.getInputs().getInput6().compareTo("on") == 0 ? 1 : 0;
		int bit7 = calampmsg.getInputs().getInput7().compareTo("on") == 0 ? 1 : 0;
		
		perpostmp.header.InputStatus = (bit7 << 7) + (bit6 << 6) + (bit5 << 5) + (bit4 << 4)
				        + (bit3 << 3) + (bit2 << 2) + (bit1 << 1) + bit0;
		
		//perpostmp.header.OutputStatus = 
		perpostmp.header.Source = 0;
		perpostmp.header.TemplateId = 1;
		
		
		System.err.println ("Body: " + gson.toJson(perpostmp));
		
		msgtmp.setBody(perpostmp);
		
		response.addMessage(msgtmp);
		
	}
	
	jsonstringfinal = gson.toJson (response);
	
	System.err.println (jsonstringfinal);
	
	return jsonstringfinal;
}

public static int getGeneralStatus(MessageContents message)
{
	int aux = 0;
	//Ignicion
	if (message.getInputs().getIgnition().compareTo("on") == 0) {
		aux |= GeneralStatusType.GENERAL_STATUS_IGNITION_VALUE;
		System.err.println("Ingnicion ON.");
	}
	if (Integer.parseInt(message.getEventCode()) == CalampEventCode.OffMainPower){
		aux |= GeneralStatusType.GENERAL_STATUS_BATTERY_VALUE;
	}
	return aux;
}

public static String getScopeString (ArrayList <DataObject> datos) throws ParseException{
	ScopeEventHeader commonHeader = new ScopeEventHeader ();
	Gson gson = new Gson ();
	ResponsePrototype response = new ResponsePrototype ();
	int calampEventCode;
	
	for (DataObject arrayElement : datos){
		
		MessagesPostPrototype message = new MessagesPostPrototype ();
		MessageContents calampMessage = arrayElement.getMessageContents();
		calampEventCode = Integer.parseInt(calampMessage.getEventCode());
		
		//Construir el header (excepto los atributos Description y templateId que dependen del calampEventCode)
		String unitId = arrayElement.getOptionsHeader().getMobileId();
		commonHeader.UnitId = unitId;
		message.setUnitId (unitId);
		SimpleDateFormat sdfu  = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
	    Date udate = sdfu.parse(calampMessage.getTimeOfFix());
	    long timeInMillisSinceEpoch123 = udate.getTime(); 
	    long durationinSeconds2 = timeInMillisSinceEpoch123 / 1000;
		commonHeader.UtcTimestampSeconds = durationinSeconds2;
		commonHeader.Latitude = Double.parseDouble(calampMessage.getLatitude());
		commonHeader.Longitude = Double.parseDouble(calampMessage.getLongitude());
		StringTokenizer st = new StringTokenizer (calampMessage.getSpeed ());
		commonHeader.Speed = (int) Double.parseDouble (st.nextToken ());
		commonHeader.Direction = Integer.parseInt(calampMessage.getHeading());
		commonHeader.Odometer = 0;
		commonHeader.InputStatus = calampMessage.getInputs().toInteger();
		commonHeader.Source = 0;
		
		switch (calampEventCode){
			
			case CalampEventCode.PeriodicReport: //Scope PeriodicPosition (templateId 1)
				ScopePeriodicPosition periodicPosition = new ScopePeriodicPosition ();
				message.setTemplateId(1);
				commonHeader.Description = "PeriodicPosition";
				periodicPosition.setHeader (commonHeader);
				//Parámetros adicionales del evento
				periodicPosition.rpm = 0;
				periodicPosition.trip_distance_meters = 0;
				periodicPosition.trip_duration_seconds = 0;
				
				message.setBody (periodicPosition);
				break;
				
			case CalampEventCode.IgnitionOn: 	//Scope EngineStart (templateId ?)
				ScopeEngineStart engineStart = new ScopeEngineStart ();
				message.setTemplateId(-1); // Corregir id
				commonHeader.Description = "EngineStart";
				engineStart.setHeader (commonHeader);
				//Parámetros adicionales del evento
				//Ninguno
				
				message.setBody (engineStart);
				break;
				
			case CalampEventCode.IgnitionOff: 	//Scope EngineStop (templateId ?)
				ScopeEngineStop engineStop = new ScopeEngineStop ();
				message.setTemplateId(1); // Corregir id
				commonHeader.Description = "EngineStop";
				engineStop.setHeader (commonHeader);
				//Parámetros adicionales del evento
				//Ninguno
			
				message.setBody (engineStop);
				break;
			
			case CalampEventCode.OnMainPower: 	//Scope MainPowerHigh (templateId 214)
				ScopeMainPowerHigh mainPowerHigh = new ScopeMainPowerHigh ();
				message.setTemplateId(214);
				commonHeader.Description = "MainPowerHigh";
				mainPowerHigh.setHeader (commonHeader);
				//Parámetros adicionales del evento
				//Ninguno? Verificar
			
				message.setBody (mainPowerHigh);
				break;				
			
			case CalampEventCode.OffMainPower: 	//Scope MainPowerLow (templateId 215)
				ScopeMainPowerLow mainPowerLow = new ScopeMainPowerLow ();
				message.setTemplateId(215);
				commonHeader.Description = "MainPowerLow";
				mainPowerLow.setHeader (commonHeader);
				//Parámetros adicionales del evento
				mainPowerLow.duration_seconds = 0;
				mainPowerLow.threshold_volts = 0.0f;
				mainPowerLow.value_volts = 0.0f;
			
				message.setBody (mainPowerLow);
				break;
				
			case CalampEventCode.BatteryLow:	//Scope BatteryLow (templateId 109)
				ScopeBatteryLow batteryLow = new ScopeBatteryLow ();
				message.setTemplateId(109);
				commonHeader.Description = "BatteryLow";
				batteryLow.setHeader (commonHeader);
				//Parámetros adicionales del evento
				batteryLow.temperature = 0;
				batteryLow.voltage = 0;
				batteryLow.battery_age = 0;
				batteryLow.charge_level_percentage = 0;
			
				message.setBody (batteryLow);
				break;
				
			case CalampEventCode.Idle: 			//Scope StartOfExcessiveIdle (templateId ?)
				ScopeStartOfExcessiveIdle startOfExcesiveIdle = new ScopeStartOfExcessiveIdle ();
				message.setTemplateId(1); // Corregir id
				commonHeader.Description = "StartOfExcessiveIdle";
				startOfExcesiveIdle.setHeader (commonHeader);
				//Parámetros adicionales del evento
				//Ninguno
			
				message.setBody (startOfExcesiveIdle);
				break;
				
			case CalampEventCode.ExcessiveIdle: 			//Scope ExcessiveIdle (templateId ?)
				ScopeExcessiveIdle excessiveIdle = new ScopeExcessiveIdle ();
				message.setTemplateId(1); // Corregir id
				commonHeader.Description = "ExcessiveIdle";
				excessiveIdle.setHeader (commonHeader);
				//Parámetros adicionales del evento
				excessiveIdle.rpm = 0;
				excessiveIdle.duration_seconds = 0;
			
				message.setBody (excessiveIdle);
				break;	
					
				
			default:
				System.err.println ("Evento " + calampEventCode + " desconocido");
		}
		
		
		
		response.addMessage (message);
		
	}
	
	String ans = gson.toJson(response);
	System.err.println (ans);
	
	return ans;
}


public static String toScopeString (ArrayList <DataObject> datos) throws ParseException, IOException{
		
		String DATE_FORMAT = "yyyyMMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Calendar c1 = Calendar.getInstance(); // today
		final String filename = "Headers_" + sdf.format(c1.getTime()) + ".txt";
		
		bw = new BufferedWriter (new FileWriter (filename, true));
		
		//Consideraciones para crear los tiempos.
		long timeAdjust = 4 * 3600;
		Gson gson = new Gson ();
		final SimpleDateFormat sdfu  = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		final Date utc1970 = sdfu.parse("1970-01-01 00:00:00");
		
		ResponsePrototype response = new ResponsePrototype ();
		int calampEventCode;
		EventHeader commonHeader;
		
		for (DataObject arrayElement : datos){
			
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
			int odometer = 0;
			int outputStatus = 0;
			int speed = (int) speedDouble;
			int templateId = idAndDescription.getTemplateId ();
			long utcTimestampSeconds = (udate.getTime () - utc1970.getTime()) / 1000 + timeAdjust;
			int generalStatus = getGeneralStatus(calampMessage);
			String 	[] accumulatorsString = calampMessage.getAccumulators();
			int accumulators [] = new int [accumulatorsString.length];
			
			for (int i = 0; i < accumulators.length; ++i)
				accumulators [i] = Integer.parseInt(accumulatorsString [i]);
			
			int tripDistance;
			int tripDuration;
			int tripIdentifier;
			
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
			if (calampMessage.getFixStatus ().getInvalidFix ().compareTo("true") == 0)
				templateId = ScopeEventCode.UnknownEvent;
			
			//Debug
			if (templateId != ScopeEventCode.UnknownEvent)
				System.err.println ("Scope event " + templateId + " (Calamp event " + 
				calampEventCode + ": " + description + ")");
			
			switch (templateId){
				
				case ScopeEventCode.PeriodicPosition:
					PeriodicPosition periodicPosition = PeriodicPosition
						.newBuilder()
						.setHeader(commonHeader)
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
					tripDistance = accumulators [0];
					tripDuration = accumulators [1];
					tripIdentifier = accumulators [2];
					
					System.err.println ("Trip distance: " + tripDistance);
					System.err.println ("Trip duration: " + tripDuration);
					System.err.println ("Trip id: " + tripIdentifier);
					
					TripStartup tripStartup = TripStartup
						.newBuilder()
						.setHeader(commonHeader)
						.setTripId(tripIdentifier)
						.build ();
					
					bytes = tripStartup.toByteArray();
					
					break;
					
				case ScopeEventCode.TripShutdown:
					tripDistance = accumulators [0];
					tripDuration = accumulators [1];
					tripIdentifier = accumulators [2];
					
					System.err.println ("Trip distance: " + tripDistance);
					System.err.println ("Trip duration: " + tripDuration);
					System.err.println ("Trip id: " + tripIdentifier);
					
					TripShutdown tripShutdown = TripShutdown
						.newBuilder()
						.setHeader(commonHeader)
						.setTripDistanceMeters(tripDistance)
						.setTripDurationSeconds(tripDuration)
						.setTripId(tripIdentifier)
						.build();
					
					bytes = tripShutdown.toByteArray();
					
				default:
					System.err.println ("Unknown Calamp event " + calampEventCode);
			}
			
			if (templateId != ScopeEventCode.UnknownEvent){
				encodedBody = Base64.encodeBase64String(bytes);
				message.setEncodedBody (encodedBody);
				response.addMessage (message);
				saveHeader (gson.toJson(commonHeader));
			}		
			
		}
		
		String ans = gson.toJson(response);
		System.out.println (ans);
		
		if (bw != null) bw.close ();
		
		return ans;

}
		
		public static void saveHeader (final String hdr) throws IOException{
			bw.write(hdr + "\n\n");
		}

}