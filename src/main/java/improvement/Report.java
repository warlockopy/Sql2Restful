package improvement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import feedback.HttpOutput;
import mysql2websrvc.Calamp2Scope;
import mysql2websrvc.HttpRest;

public class Report {
	
	private String calampReport;
	private String scopeReport;
	private String serverResponse;
	private boolean conversionSuccess;
	private String rawData;
	
	//Constants
	static final String baseDirectory = "/home/sistema/git/Log/Calamp/EVENTS/";
	static final String separatorLine = "\n----------------";
		
	public Report (final String calampReport){
		this.calampReport = calampReport;
		convert ();
	}
	
	private void convert (){
		scopeReport = Calamp2Scope.convert(calampReport);
		conversionSuccess = scopeReport != null;
	}
	
	//Send to Scope server
	public void send (){
		if (conversionSuccess){
			try {
				System.out.println ("Sending " + scopeReport + "\n");
				HttpOutput httpOutput = HttpRest.httpsClientC(scopeReport);
				serverResponse = httpOutput.getOutput();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void save (final String directoryString){
		final String mobileId = getMobileIdFrom (calampReport);
		final String fileName = mobileId + ".txt";
		
		//Create directory if it does not exist
		File directory = new File (directoryString);
		if (!directory.exists())
			if (!directory.mkdir())
				System.out.println ("Cannot create directory \"" + directoryString + "\"");
		
		try {
			FileWriter fWriter = new FileWriter (directoryString + fileName, true);
			BufferedWriter writer = new BufferedWriter (fWriter);
			
			writer.write(calampReport + separatorLine);
			writer.newLine();
			
			if (conversionSuccess){
				writer.write(scopeReport + separatorLine);
				writer.newLine();
				writer.write(serverResponse + separatorLine);
				writer.newLine();
			}
			
			writer.newLine();
			writer.close ();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void save (){
		save (baseDirectory + getDateString () + "/");
	}
	
	private String getDateString (){
		DateFormat format = new SimpleDateFormat ("yyyy_MM_dd");
		String dateString = format.format (new Date ());
		
		return dateString;
	}

	public boolean getConversionSuccess() {
		return conversionSuccess;
	}
	
	public static String getMobileIdFrom (final String calampString){
		String ans = "0";
		String match = "\"mobileId\":\"";
		
		int index = calampString.indexOf(match);
		
		if (index != -1){
			int index1 = index + match.length();
			int index2 = index1;
			
			while (calampString.charAt(index2) != '"')
				++index2;
			
			ans = calampString.substring(index1, index2);
		}
		
		return ans;
	}
	
	public void setRawData (final String rawData){
		this.rawData = rawData;
	}
}
