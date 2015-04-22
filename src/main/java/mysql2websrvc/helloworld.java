package mysql2websrvc;

import java.io.*;
//mySql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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









//http
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class helloworld {
	public static void main (String [] args)
	{
		ArrayList<DataObject> jsonin;
				
		/*
		UdpServer server = new UdpServer ();
		
		server.readIncomingData(5000);
		*/
		
		//*
		try{
			System.out.println("Iniciando extraccion de datos");
			System.out.println("-----------------------------");
			
			System.out.println("UTC"  + System.currentTimeMillis()/1000);
			
			//Conexion a MySql
			ReadJsonfromMysql.open();
			jsonin = ReadJsonfromMysql.ConectToDB();
			System.out.println("SQL Ok.");
			
			//Conexion a servicio HTTP restful
			if (jsonin != null){
				String jsonString;
				
				jsonString = Calamp2Scope.toScopeString (jsonin);
				//jsonString = Calamp2Scope.MigrateBackup (jsonin);
				//jsonString = Calamp2Scope.getScopeString(jsonin);
				
				httprestjava.HttpsClientC(jsonString);
				//ReadJsonfromMysql.deleteData();
			}
			
			ReadJsonfromMysql.close();
			System.out.println("FIN\n");
			
		}
		catch (Exception e)
		{
			e.getStackTrace();
			e.printStackTrace();
		}
		//*/
	}
	
	public static void testConnect() {
		String dbUrl = "jdbc:mysql://209.208.110.219/f_workstation";
		String dbClass = "com.mysql.jdbc.Driver";
		String querytest = "select fws_eve_event from fws_event";
		String query2 = "Select * from fws_event";
		String username = "root";
		String password = "Base.2015";
		try {
			Class.forName(dbClass);
			Connection connection = DriverManager.getConnection(dbUrl, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query2);
			
			while (resultSet.next()) {
				String tableName = resultSet.getString(1);
				System.out.println("Table name : " + tableName);
				String dato = resultSet.getString("fws_eve_event");
				System.out.println("Data : " + dato);
			}
			
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}		
}
