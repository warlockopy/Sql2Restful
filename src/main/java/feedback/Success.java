package feedback;

import java.util.ArrayList;

public class Success {
	
	private String scopeString;
	private ArrayList <String> scopeMessages;
	private ArrayList <String> successCodes;
	private boolean someMessageToSend;
	
	public Success (final String string, final ArrayList <String> messages,
			final ArrayList <String> successCodes, boolean someMessageToSend){
		this.scopeString = string;
		this.scopeMessages = messages;
		this.successCodes = successCodes;
		this.someMessageToSend = someMessageToSend;
	}
	
	public String getScopeString (){
		return scopeString;
	}
	
	public String getSuccessCodeAt (int index){
		return successCodes.get(index);
	}
	
	public String getMessageAt (int index){
		return scopeMessages.get(index);
	}
	
	public boolean hasMessagesToSend (){
		return someMessageToSend;
	}
	
	public int countItems (){
		int n = scopeMessages.size ();
		
		if (successCodes.size () != n) System.err.println ("Error. Longitudes diferentes");
		
		return n;
	}
}
