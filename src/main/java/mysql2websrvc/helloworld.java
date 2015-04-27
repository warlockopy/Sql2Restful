package mysql2websrvc;

import java.io.*;
//mySql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;











import ScopeProtoJava.EventHeaderProto.EventHeader;
import ScopeProtoJava.PeriodicPositionProto;
import ScopeProtoJava.PeriodicPositionProto.PeriodicPosition;





// Importaciones para el parser json
import com.google.gson.Gson;

import mysql2websrvc.ScopePrototypes.ScopePeriodicPosition;

import org.apache.commons.codec.binary.Base64;
// Restful
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;


public class helloworld {
	
	static BufferedWriter writer;
	static Gson gson = new Gson ();
	
	public static void main (String [] args) throws IOException
	{
		writer = new BufferedWriter (new FileWriter ("eventos.txt", true));
		Scanner sc = new Scanner (System.in);
		
		ArrayList<DataObject> jsonin;
				
		/*
		UdpServer server = new UdpServer ();
		
		server.readIncomingData(5000);
		*/
		
		//*
		
		//choice = choose.findInLine("end");		
		
		try{
				
				System.out.println("Iniciando extraccion de datos");
				System.out.println("-----------------------------");
				
				while (true){
					
					//Conexion a MySql
					ReadJsonfromMysql.open();
					System.out.println("SQL Ok.");
				
					jsonin = ReadJsonfromMysql.ConectToDB();
					//Conexion a servicio HTTP restful
					if (jsonin != null){
						String jsonString;
					
						jsonString = Calamp2Scope.toScopeString (jsonin);
						guardar (gson.toJson (jsonin), jsonString);
						httprestjava.HttpsClientC(jsonString);
						ReadJsonfromMysql.deleteData();
					}
					
					ReadJsonfromMysql.close();
					
					/*
					if (sc.hasNext ()){
						if (sc.next ().compareToIgnoreCase("fin") == 0)
							break;
					}
					//*/
					
				}
					
				
				//System.out.println("FIN\n");
				//Thread.sleep(5000);
		}
		catch (Exception e)
		{
			e.getStackTrace();
			e.printStackTrace();
		}
		
		if (writer != null) writer.close ();
		
		//*/
	}
	
	public static void guardar (final String calampString, final String scopeString) throws IOException{
		writer.write("Calamp events:\n\n");
		writer.write(calampString + "\n\n\n\n\n");
		writer.write("Scope events:\n\n");
		writer.write(scopeString + "\n\n\n\n\n");
	}
}
