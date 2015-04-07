package mysql2websrvc;

import java.util.ArrayList;

public class ResponsePrototype {
	private String batch_id;
	private ArrayList <MessagesPostPrototype> messages;
	
	public ResponsePrototype (){
		messages = new ArrayList ();
		batch_id = "";
		final String tabla = "0123456789abcdef";
		
		
		for (int i = 0; i < 32; ++i){
			
			if (i == 8 || i == 12 || i == 16 || i == 20) batch_id += "-";
			
			int pos = (int) (Math.random() * 100000) % 16;
			batch_id += tabla.substring(pos, pos + 1);
		}
	}
	
	public void addMessage (MessagesPostPrototype msg){
		msg.setId (messages.size () + 1);
		messages.add (msg);
	}
}
