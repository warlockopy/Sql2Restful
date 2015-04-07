package mysql2websrvc;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;

public class MessagesPostPrototype {
	private int id;
	private String unit_id;
	private int template_id;
	private String body;
	
	public MessagesPostPrototype (int id, String unitId, int tempId){
		this.id = id;
		unit_id = unitId;
		template_id = tempId;
	}
	
	public MessagesPostPrototype (){
		
	}
	
	void setId (int id){
		this.id = id;
	}
	
	void setUnitId (String uid){
		unit_id = uid;
	}
	
	void setTemplateId (int tmpId){
		template_id = tmpId;
	}
	
	public void setBody (Object o){
		Gson gson = new Gson ();
		String tmp = gson.toJson (o);
		body = Base64.encodeBase64String(tmp.getBytes());
	}
}