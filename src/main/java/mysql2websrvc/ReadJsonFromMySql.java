package mysql2websrvc;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.google.gson.Gson;

public class ReadJsonFromMySql {
	private static String dbUrl = "jdbc:mysql://209.208.110.219/f_workstation";
	private static String dbClass = "com.mysql.jdbc.Driver";
	private static String username = "root";
	private static String password = "Base.2015";
	private static ArrayList <DataObject> mysqljsonobject;
	private static ArrayList <BigInteger> eventIdList;
	
	private static Connection connection;
	private static Statement statement;
	
	
	public static void open (){
		try {
			Class.forName(dbClass);
			connection = DriverManager.getConnection(dbUrl, username, password);
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static void deleteData (int limit){
		try {
			statement.execute("DELETE FROM fws_event WHERE 1=1 ORDER BY fws_eve_id LIMIT " + limit);
			eventIdList.clear(); //Cuando borra los registros limpia la lista de IDs
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*for (BigInteger eventId : eventIdList){
			String deleteTableSQL = "DELETE FROM fws_event WHERE fws_eve_id = " + eventId;
			
			try {
				statement.execute (deleteTableSQL);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
	
	public static void copy (BigInteger eventId){
		final String query = "INSERT INTO fws_queue SELECT * FROM "
				 + "fws_event WHERE fws_eve_id=\"" + eventId + "\"";
		
		try {
			statement.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList <BigInteger> getEventIdList (){
		return eventIdList;
	}
	
	public static BigInteger getEventIdAt (int index){
		return eventIdList.get(index);
	}
	
	public static void close (){
		try {
			connection.close ();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList <String> readRawData (int limit){
		String query = "SELECT * FROM fws_event ORDER BY fws_eve_id LIMIT " + limit;
		
		try {
			ResultSet resultSet = statement.executeQuery(query);
			ArrayList <String> rawData = new ArrayList();
			eventIdList = new ArrayList ();
			
			while (resultSet.next()) {				
				String tableName = resultSet.getString(1);
				//String dato = resultSet.getString("fws_eve_event");
				String rawDataString = resultSet.getString("fws_eve_raw_data");
				rawData.add(rawDataString);
			}
			
			//connection.close();
			return rawData;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayList <DataObject> connectToDB(int limit){
		String query = "SELECT * FROM fws_event ORDER BY fws_eve_id LIMIT " + limit;
		try {
			//Se conecta a la base de datos
			//Class.forName(dbClass);
			//Connection connection = DriverManager.getConnection(dbUrl, username, password);
			//Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			mysqljsonobject = new ArrayList();
			//Extrae los datos
			eventIdList = new ArrayList ();
			
			while (resultSet.next()) {				
				String tableName = resultSet.getString(1);
				//System.out.println("Table name : " + tableName);
				String dato = resultSet.getString("fws_eve_event");
				String eveIdString = resultSet.getString ("fws_eve_id");
				BigInteger eventId = new BigInteger (eveIdString);
				eventIdList.add (eventId);
				//System.out.println("Data : " + dato);
				mysqljsonobject.add(json2Obj(dato));
			}
			
			//connection.close();
			return mysqljsonobject;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static DataObject json2Obj(String jsondata){
		Gson gson = new Gson();
		DataObject obj = gson.fromJson(jsondata, DataObject.class);
		
		//System.out.println("Parsing...");
		//System.out.println(obj);
		//System.out.println("Done.");
		
		return obj;
	}

	public static void clearIdList() {
		eventIdList.clear ();
	}
}
