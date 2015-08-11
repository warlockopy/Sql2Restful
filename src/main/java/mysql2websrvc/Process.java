package mysql2websrvc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;

import feedback.HttpOutput;
import feedback.ServerResponse;
import feedback.Success;

public class Process extends Thread{
	@Override
	public void run (){
		ArrayList <DataObject> calampData;
		int httpResult = 0;
		Gson gson = new Gson ();
		boolean zeromsg = false;

		while (true){
			//zeromsg = true;
			ArrayList <String> calampStrings  = ReadJsonFromMySql.readAsStrings ();
			calampData = ReadJsonFromMySql.connectToDB();
			
			if (calampStrings.size() > 0){  

				zeromsg = true;

				String scopeString;
				
				try {
					Success success = Calamp2Scope.toScopeString (calampData);
					scopeString = success.getScopeString();
					HttpOutput httpOutput = HttpRest.httpsClientC(scopeString);
					httpResult = httpOutput.getCode ();
					String serverOutputString = httpOutput.getOutput ();
					ServerResponse serverResponse = gson.fromJson(serverOutputString, ServerResponse.class);
					//saveEvents (calampData, success, serverResponse);
					saveEvents (calampStrings, success, serverResponse);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}	
				
				if (httpResult == 200 || httpResult == 404) { 
					ReadJsonFromMySql.deleteData();
					System.out.println("Proceso de borrado MySql...");
				}
				
			}
			else {
				if (zeromsg){
					System.out.println("0 Mensajes.");
					zeromsg = false;
				}
				else{
					System.out.print(".");
				}
				try {
					sleep (5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	public static void saveEvents (final ArrayList <DataObject> calampData,
			final Success success, final ServerResponse serverResponse){
		
		int n = calampData.size (), m = serverResponse.size ();
		int responseIndex = 0;
		Gson gson = new Gson ();
		
		System.out.println ("Saving " + n + " messages, (" + m + " are valid)");
		
		for (int i = 0; i < n; ++i){
			String calampString = gson.toJson (calampData.get(i));
			String scopeString = "";
			String serverString = "";
			String successCode = success.getSuccessCodeAt(i);
			boolean sent = successCode.equals ("sent");
			
			if (sent){
				scopeString = success.getMessageAt(i);
				serverString = serverResponse.getResultAt(responseIndex);
				++responseIndex;
			}
			
			String toSave = calampString;
			
			String mobileId = getMobileIdFrom (calampString);
			
			if (sent){
				toSave += "\n--------\n" + scopeString + "\n--------\n" + serverString + "\n";
			}
			else
				toSave += "\n--------\n" + successCode + "\n";
			
			saveString (toSave, mobileId);
		}
		
	}*/
	
	public static void saveEvents (final ArrayList <String> calampStrings,
			final Success success, final ServerResponse serverResponse){
		
		int n = calampStrings.size (), m = serverResponse.size ();
		int responseIndex = 0;
		Gson gson = new Gson ();
		
		System.out.println ("Saving " + n + " message" + (n == 1 ? "" : "s") 
				+ ", (" + m + (m == 1 ? " is" : " are") + " valid)");
		
		for (int i = 0; i < n; ++i){
			//String calampString = gson.toJson (calampData.get(i));
			String calampString = calampStrings.get(i);
			String scopeString = "";
			String serverString = "";
			String successCode = success.getSuccessCodeAt(i);
			boolean sent = successCode.equals ("sent");
			
			if (sent){
				scopeString = success.getMessageAt(i);
				serverString = serverResponse.getResultAt(responseIndex);
				++responseIndex;
			}
			
			String toSave = calampString;
			String mobileId = getMobileIdFrom (calampString);
			
			if (sent){
				toSave += "\n--------\n" + scopeString + "\n--------\n" + serverString + "\n";
			}
			else
				toSave += "\n--------\n" + successCode + "\n";
			
			saveString (toSave, mobileId);
		}
		
	}
	
	public static void saveString (final String string, final String mobileId){
		
		DateFormat format = new SimpleDateFormat ("yyyy_MM_dd");
		String dateString = format.format (new Date ());
		String dir = "EVENTS/EVENTS_" + dateString;
		String fileName = mobileId + ".txt";
		
		File directory = new File (dir);
		String path = directory.getAbsolutePath() + "/" + fileName;
		
		//System.out.println ("Path: " + directory.getAbsolutePath());
		
		if (!directory.exists())
			if (directory.mkdir() == false)
				System.out.println ("Error. No se pudo crear el directorio " + directory.getAbsolutePath());
				
		
		try {
			FileWriter fWriter = new FileWriter (dir + "/" + fileName, true);
			BufferedWriter writer = new BufferedWriter (fWriter);
			
			writer.write(string);
			writer.newLine();
			
			writer.close ();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	public static String getMobileIdFrom (final String calampString){
		String ans = "0";
		String match = "\"mobileId\":\"";
		
		int index = calampString.lastIndexOf(match);
		
		if (index != -1){
			int index1 = index + match.length();
			int index2 = index1;
			
			while (calampString.charAt(index2) != '"')
				++index2;
			
			ans = calampString.substring(index1, index2);
		}
		
		System.out.println ("********\nMOBILE ID = " + ans + "\n********");
		
		return ans;
	}
}
