package feedback;

import java.util.ArrayList;

public class Success {
	
	private String scopeString;
	private ArrayList <String> scopeMessages;
	private ArrayList <String> successCodes;
	
	public Success (final String string, final ArrayList <String> messages,final ArrayList <String> successCodes){
		this.scopeString = string;
		this.scopeMessages = messages;
		this.successCodes = successCodes;
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
}
