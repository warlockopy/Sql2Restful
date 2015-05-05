package mysql2websrvc;

import java.io.*;
import java.*;
//mySql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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
		
		Process process = new Process ();
		
		try{
			ReadJsonfromMysql.open();
			System.out.println("SQL Opened.");
			System.out.println("Comienza Hilo...");
			process.start();
			System.in.read();
			process.interrupt();
			ReadJsonfromMysql.close();		
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
