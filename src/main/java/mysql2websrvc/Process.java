package mysql2websrvc;

import java.io.BufferedWriter;
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
		
		while (true){

			calampData = ReadJsonfromMysql.connectToDB();
			
			if (calampData.size() > 0){  
				
				String scopeString;
				
				try {
					Success success = Calamp2Scope.toScopeString (calampData);
					scopeString = success.getScopeString();
					HttpOutput httpOutput = httprestjava.httpsClientC(scopeString);
					httpResult = httpOutput.getCode ();
					String serverOutputString = httpOutput.getOutput ();
					ServerResponse serverResponse = gson.fromJson(serverOutputString, ServerResponse.class);
					saveEvents (calampData, success, serverResponse);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}	
				
				if (httpResult == 200 || httpResult == 404) { 
					ReadJsonfromMysql.deleteData();
					System.out.println("Proceso de borrado MySql...");
				}
				
			}
			else {
				System.out.println("0 Mensajes.");
			}
		}
	}
	
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
			
			if (sent){
				toSave += "\n--------\n" + scopeString + "\n--------\n" + serverString + "\n";
			}
			else
				toSave += "\n--------\n" + successCode + "\n";
			
			saveString (toSave);
		}
		
	}
	
	private static void saveString (final String string){
		
		DateFormat format = new SimpleDateFormat ("yyyy_MM_dd");
		String dateString = format.format (new Date ());
		String fileName = "EVENTS_" + dateString + ".txt";
		
		try {
			FileWriter fWriter = new FileWriter (fileName, true);
			BufferedWriter writer = new BufferedWriter (fWriter);
			
			writer.write(string);
			writer.newLine();
			
			writer.close ();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
