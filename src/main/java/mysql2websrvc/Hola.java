package mysql2websrvc;

import java.io.FileWriter;
import java.util.Scanner;

public class Hola {
	
	public static void main (String [] args){
		
		Scanner sc = new Scanner (System.in);
		
		while (sc.hasNext ()){
			
			String name = sc.next ();
			name = sc.next ();
			name = sc.next ();
			
			name = name.substring (0, name.length () - 1);
			
			System.out.println (name + " = headertmp." + name + ";");
			
		}
		
	}
	
}
