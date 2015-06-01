package mysql2websrvc;

import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

import com.google.gson.Gson;

import feedback.Result;
import feedback.ServerResponse;

public class Hola {
	
	/*
	
	public static void main (String args []){
		
		String s = "{\"batch_id\":\"a2363c04-85a0-55ed-3e12-6dcb938ed16b\"," +
		"\"results\":[{\"id\":1,\"result\":\"UnitNotAccessible\"}," +
				"{\"id\":2,\"result\":\"UnitNotAccessible\"}," +
				"{\"id\":3,\"result\":\"UnitNotAccessible\"}," +
				"{\"id\":4,\"result\":\"UnitNotAccessible\"}]}";
		
		Gson gson = new Gson ();
		ServerResponse response = new ServerResponse ();
		response = gson.fromJson(s, ServerResponse.class);
		
		echo (response);
		
	}
	
	//*/
	
	public static void echo (Object obj){
		System.out.println (obj);
	}
	
}
