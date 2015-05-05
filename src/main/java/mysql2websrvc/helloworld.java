package mysql2websrvc;

import java.io.*;
import java.io.IOException;

// Importaciones para el parser json
import com.google.gson.Gson;


public class helloworld {
	
	static BufferedWriter writer;
	static Gson gson = new Gson ();
	
	public static void main (String [] args) throws IOException
	{
		
		writer = new BufferedWriter (new FileWriter ("eventos.txt", true));
		
		Process process = new Process ();
		
		try{
			ReadJsonfromMysql.open();
			System.out.println("SQL Opened.");
			System.out.println("Comienza Hilo...");
			process.start();
			System.in.read();
			process.interrupt();
			ReadJsonfromMysql.close();
			System.exit(0);
		}
		catch (Exception e)
		{
			e.getStackTrace();
			e.printStackTrace();
		}
		
				
		/*
		UdpServer server = new UdpServer ();
		
		server.readIncomingData(5000);
		*/
		
		/*
		Thread t = new Thread(new Runnable() {
			public void run(){
				ArrayList<DataObject> jsonin;
				while (true){
					System.out.println("Iniciando extraccion de datos");
					System.out.println("-----------------------------");
					jsonin = ReadJsonfromMysql.ConectToDB();
					//Conexion a servicio HTTP restful
					if (jsonin.size() > 0){
						String jsonString;
						
						try {
							jsonString = Calamp2Scope.toScopeString (jsonin);
							guardar ("Calamp:\n\n");
							guardar (gson.toJson (jsonin));
							guardar ("\n\n\n\nScope\n\n");
							guardar (jsonString);
							httprestjava.HttpsClientC(jsonString);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
						ReadJsonfromMysql.deleteData();
					} else
					{
						System.out.println("0 Mensajes.");
					}
				}
			}
		});		
		// realiza el proceso hasta que se interrumpe
		try{
			ReadJsonfromMysql.open();
			System.out.println("SQL Opened.");
			System.out.println("Comienza Hilo...");
			t.start();
			System.in.read();
			t.interrupt();
			ReadJsonfromMysql.close();		
		}
		catch (Exception e)
		{
			e.getStackTrace();
			e.printStackTrace();
		}
		*/
		
		if (writer != null) writer.close ();
		
	}
	
	public static void guardar (final String str) throws IOException{
		writer.write(str + "\n\n\n\n\n");
	}
}
