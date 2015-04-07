package mysql2websrvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.google.gson.Gson;

public class ReadJsonfromMysql {
	private static String dbUrl = "jdbc:mysql://209.208.110.219/f_workstation";
	private static String dbClass = "com.mysql.jdbc.Driver";
	private static String query = "Select * from fws_event";
	private static String username = "root";
	private static String password = "Base.2015";
	private static ArrayList <DataObject> mysqljsonobject;
	
	public static ArrayList<DataObject> ConectToDB(){
		try {
			//Se conecta a la base de datos
			Class.forName(dbClass);
			Connection connection = DriverManager.getConnection(dbUrl, username, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			mysqljsonobject = new ArrayList();
			//Extrae los datos
			while (resultSet.next()) {
				String tableName = resultSet.getString(1);
				System.out.println("Table name : " + tableName);
				String dato = resultSet.getString("fws_eve_event");
				System.out.println("Data : " + dato);
				mysqljsonobject.add(Json2Obj(dato));
			}
			connection.close();
			return mysqljsonobject;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static DataObject Json2Obj(String jsondata){
		Gson gson = new Gson();
		
		DataObject obj = gson.fromJson(jsondata, DataObject.class);
		
		System.out.println("Parsing...");
		System.out.println(obj);
		
		System.out.println("Done.");
		return obj;
	}
}
