package mysql2websrvc;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer extends Thread {
	
	static final int bufferSize = 65536;
	
	public UdpServer (){
		
	}
	
	public String readIncomingData (int localPortNumber){
		DatagramSocket sock = null;
		String incomingDataString = null;
		
		try{
			sock = new DatagramSocket (localPortNumber);
			byte [] buffer = new byte [bufferSize];
			DatagramPacket incoming = new DatagramPacket (buffer, buffer.length);
			
			System.out.println ("Inicio");
			
			while (true){
				sock.receive(incoming);
				byte[] data = incoming.getData ();
				String s = new String (data, 0, incoming.getLength ());
				System.out.println (incoming.getAddress ().getHostAddress () + " : " + incoming.getPort () + " - " + s);
				incomingDataString = "OK : " + s;
				DatagramPacket dp;
				dp = new DatagramPacket (s.getBytes() , s.getBytes().length , incoming.getAddress() , incoming.getPort());
				sock.send(dp);
			}
			
		}
		catch (IOException e){
			System.err.println("IOException " + e);
		}
		
		
		return incomingDataString;
	}
}
