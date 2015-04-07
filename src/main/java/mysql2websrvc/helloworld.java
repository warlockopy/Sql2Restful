package mysql2websrvc;

import java.io.*;
//mySql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;




// Importaciones para el parser json
import com.google.gson.Gson;

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
		
		Jsonprototype j = new Jsonprototype ();
		Gson gson = new Gson ();
		
		MessagesPostPrototype msg1 = new MessagesPostPrototype ();
		MessagesPostPrototype msg2 = new MessagesPostPrototype ();
		MessagesPostPrototype msg3 = new MessagesPostPrototype ();
		
		ResponsePrototype response = new ResponsePrototype ();
		msg1.setBody(j);
		
		response.addMessage (msg1);
		response.addMessage (msg2); 
		response.addMessage (msg3); 
		
		String jsonString = gson.toJson (response);
		
		//System.out.println (jsonString);
		//System.exit (0);
		
		try{
			System.out.println("Iniciando extraccion de datos");
			System.out.println("-----------------------------");
			
			String sTexto;
			//Conexion a MySql
			jsonin = ReadJsonfromMysql.ConectToDB();
			//Conexion a servicio HTTP restful
			if (jsonin != null)
				httprestjava.HttpsClientC(jsonString);
			System.out.println("FIN\n");
			
		}
		catch (Exception e)
		{
			e.getStackTrace();
			e.printStackTrace();
		}
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
