package emuGeo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import mysql2websrvc.CalampEventCode;
import mysql2websrvc.MessagesPostPrototype;
import mysql2websrvc.ResponsePrototype;
import mysql2websrvc.ScopeTemplateIdAndDescription;
import mysql2websrvc.HttpRest;
import scopeProto.EventHeaderProto.EventHeader;
import scopeProto.TripStartupProto.TripStartup;
import utilities.Tokenizer;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;

import feedback.HttpOutput;

public class Emulacion {
	public void readPolyzone(String fileName) throws ParseException{
		
		FileReader fReader = null;
		BufferedReader reader = null;
		
		try{
			fReader = new FileReader (fileName);
			reader = new BufferedReader (fReader);
			Gson gson = new Gson ();
			
			String line;
			int count = 0;
			String firstLine = reader.readLine();
			ResponsePrototype response = new ResponsePrototype ();
			
			while ((line = reader.readLine()) != null){
				
				System.out.println (line);
				++count;
				
				Tokenizer tok = new Tokenizer (line);
				String Nombre = tok.nextToken();
				int NroPunto = tok.nextInt();
				double latitud = tok.nextDouble();
				double longitud = tok.nextDouble();
				String geoDescription = tok.nextToken();
				MessagesPostPrototype message = new MessagesPostPrototype ();
				String unitId = "1333006516";
				
				final SimpleDateFormat sdfu  = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
				Date udate= new java.util.Date();
				final Date utc1970 = sdfu.parse("1970-01-01 00:00:00");
				long timeAdjust = 4 * 3600;
				long utcTimestampSeconds = (udate.getTime () - utc1970.getTime()) / 1000 + timeAdjust;
				ScopeTemplateIdAndDescription idAndDescription = new ScopeTemplateIdAndDescription (CalampEventCode.BeginingOfDrive);
				
				String description = idAndDescription.getDescription ();
				int templateId = idAndDescription.getTemplateId ();
				
				EventHeader commonHeader;
				
				commonHeader = EventHeader.newBuilder()
						.setDescription(description)
						.setDirection(0)
						.setDriverKeyCode(0)
						.setInputStatus(0)
						.setLatitude(latitud)
						.setLongitude(longitud)
						.setOdometer(0)
						.setOutputStatus(0)
						.setSource(8)
						.setSpeed(0)
						.setTemplateId(templateId)
						.setUnitId(unitId)
						.setUtcTimestampSeconds(utcTimestampSeconds + count * 10)
						.setGeneralStatus(1)
						.build ();
				
				message.setTemplateId(templateId);
				message.setUnitId (unitId);
				
				TripStartup scopeEvent = TripStartup
						.newBuilder()
						.setHeader(commonHeader)
						.build ();
				
				System.out.println (gson.toJson (scopeEvent));
				
				String encodedBody = Base64.encodeBase64String(scopeEvent.toByteArray());
				
				message.setEncodedBody (encodedBody);
				response.addMessage (message);
				
			}
			
			System.out.println ("\n" + count + " points\n");

			HttpOutput serverOutput = HttpRest.send(response);
			
			reader.close();
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
