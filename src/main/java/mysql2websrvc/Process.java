package mysql2websrvc;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

public class Process extends Thread{
	@Override
	public void run (){
		ArrayList <DataObject> jsonin;
		int httpResult = 0;
		
		while (true){

			jsonin = ReadJsonfromMysql.ConectToDB();

			if (jsonin.size() > 0){
				String jsonString;
				
				try {
					jsonString = Calamp2Scope.toScopeString (jsonin);
					httpResult = httprestjava.HttpsClientC(jsonString);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}	
				
				if (httpResult == 200) {
					ReadJsonfromMysql.deleteData();
					System.out.println("Proceso de borrado MySql...");
				}
				
				}
			}
			else {
				System.out.println("0 Mensajes.");
			}
		}
	}
}
