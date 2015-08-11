package main;

import java.io.*;
import java.text.ParseException;
import java.util.Scanner;

import mysql2websrvc.Process;
import mysql2websrvc.ReadJsonFromMySql;

import com.google.gson.Gson;

import emuGeo.Emulacion;


public class HelloWorld {
	
	static Gson gson = new Gson ();
	
	//*
	public static void main (String [] args) throws IOException
	{
		Scanner sc = new Scanner (System.in);
		
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
