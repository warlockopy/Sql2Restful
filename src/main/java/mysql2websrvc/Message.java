package mysql2websrvc;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;

public class Message {
	
	private int Id;
	private String MessageType;
	private String PayLoad;
	
	public Message (){
		MessageType = "DDS";
	}
	
	public void setId (int id){
		this.Id = id;
	}
	
	public void setPayLoad (final Object obj){
		Gson gson = new Gson ();
		String jsonString = gson.toJson (obj);
		PayLoad = Base64.encodeBase64String(jsonString.getBytes());
	}
}
