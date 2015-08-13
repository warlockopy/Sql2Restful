package main;

import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import mysql2websrvc.Calamp2Scope;
import mysql2websrvc.DataObject;
import mysql2websrvc.HttpRest;
import mysql2websrvc.Process;
import mysql2websrvc.ReadJsonFromMySql;

import com.google.gson.Gson;

import emuGeo.Emulacion;
import feedback.HttpOutput;
import feedback.Success;


public class HelloWorld {
	
	static Gson gson = new Gson ();
	
	//*
	public static void main (String [] args) throws Exception
	{
		Scanner sc = new Scanner (System.in);
		ReadJsonFromMySql.open();
		ReadJsonFromMySql.copy (new BigInteger ("5449700"));
		System.exit (0);
		
		/* Enviar un reporte calamp
		String calamp = sc.nextLine ();
		DataObject dObj = ReadJsonFromMySql.json2Obj(calamp);
		ArrayList <DataObject> data = new ArrayList ();
		data.add (dObj);
		Success success = Calamp2Scope.toScopeString(data);
		String scope = success.getScopeString();
		HttpOutput out = HttpRest.httpsClientC(scope);
		echo (out.getOutput());
		
		System.exit(0);
		*/
		
		//Enviar geocercas
		/*
		final String fileName = "target/Polygonal Geofences Jorge Arevalos.csv";
		
		try {
			new Emulacion ().readPolyzone(fileName);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.exit(0);
		*/
		//fin
		
		Process process = new Process ();
		
		try{
			ReadJsonFromMySql.open();
			System.out.println("SQL Opened.");
			System.out.println("Comienza Hilo...");
			process.start();
			
			while (!sc.next ().equals ("exit"));
			
			process.interrupt();
			ReadJsonFromMySql.close();
			sc.close ();
			System.exit(0);
		}
		catch (Exception e)
		{
			e.getStackTrace();
			e.printStackTrace();
		}
			
	}
	
	//*/
	
	public static void echo (Object obj){
		System.out.println (obj);
	}
	
}
