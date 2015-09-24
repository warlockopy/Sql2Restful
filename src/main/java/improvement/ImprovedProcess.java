package improvement;

import java.util.ArrayList;

import mysql2websrvc.DataObject;
import mysql2websrvc.ReadJsonFromMySql;

public class ImprovedProcess extends Thread {
	
	private boolean noMessagesHeader;
	
	@Override
	public void run (){
		
		while (true){
			
			ArrayList <DataObject> calampObjects = ReadJsonFromMySql.connectToDB (100); //Limit to 100 rows
			int itemsRead = calampObjects.size ();
			ArrayList <String> rawData = ReadJsonFromMySql.readRawData (itemsRead);
			
			if (calampObjects.size () > 0){
				noMessagesHeader = false; System.out.println ();
				
				//Completar
			}
			else{ //No messages read
				if (noMessagesHeader == false){
					System.out.print ("No messages");
					noMessagesHeader = true;
				}
				else System.out.print(".");
				
			}
			
		}
		
	}
	
}
