package mysql2websrvc;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Process extends Thread{
	@Override
	public void run (){
		ArrayList <DataObject> jsonin;
		
		while (true){

			jsonin = ReadJsonfromMysql.ConectToDB();

			if (jsonin.size() > 0){
				String jsonString;
				
				try {
					jsonString = Calamp2Scope.toScopeString (jsonin);
					httprestjava.HttpsClientC(jsonString);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}	
				
				ReadJsonfromMysql.deleteData();
			}
			else {
				System.out.println("0 Mensajes.");
			}
		}
	}
}
