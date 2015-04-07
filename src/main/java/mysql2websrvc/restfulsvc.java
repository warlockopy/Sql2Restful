package mysql2websrvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.impl.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import com.google.gson.JsonObject;

public class restfulsvc {
	public static String urlscope = "https://us.scopemp.net/Scope.MProfiler.ThirdPartyGateway.Api/api/v1/messages";
	
	public static void main (String [] args) throws URISyntaxException
	{
	 	try {
			restfunc("prueba");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	
	}
	
	public static void restfunc(String data) throws UnsupportedEncodingException, URISyntaxException{
		String user = "user";
		String base64key = "key";
		
		
			
			DefaultHttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(urlscope);
			//armamos el header
			post.setHeader ("Accept", "application/json");
			post.setHeader ("Host","us.scopemp.net");
			post.setHeader ("X-SCP-Date", "16 Aug 2011 8:37:25 GMT");
			post.setHeader ("X-SCP-Autentication", user + ":" + getB64Auth(user, base64key));			
			
			//creamos la info
			List  nvps = new ArrayList ();
			nvps.add(new BasicNameValuePair("data[body]", "test"));
			AbstractHttpEntity ent=new UrlEncodedFormEntity(nvps, HTTP.UTF_8);
			ent.setContentType("application/x-www-form-urlencoded; charset=UTF-8");
			ent.setContentEncoding("UTF-8");
			post.setEntity(ent);
			post.setURI(new URI(urlscope));
			
			
			try {
				HttpResponse response = client.execute(post);
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public static String getB64Auth (String login, String pass) {
		   String source=login + ":" + pass;
		   String ret="Basic " + Base64.encodeBase64String(source.getBytes());
		   return ret;
	}
	
		public static void RestJersey(String string) {
		 
		try {
		// create HTTP Client
		HttpClient httpClient = HttpClientBuilder.create().build();
		 
		// Create new getRequest with below mentioned URL
		HttpGet getRequest = new HttpGet(urlscope);
		HttpPost PostRequest = new HttpPost(urlscope);
		 
		// Add additional header to getRequest which accepts application/xml data
		getRequest.addHeader("accept", "application/json");
		 
		// Execute your request and catch response
		HttpResponse response = httpClient.execute(getRequest);
		 
		// Check for HTTP response code: 200 = success
		if (response.getStatusLine().getStatusCode() != 200) {
		throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
		}
		 
		// Get-Capture Complete application/xml body response
		BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
		String output;
		System.out.println("============Output:============");
		 
		// Simply iterate through XML response and show on console.
		while ((output = br.readLine()) != null) {
		System.out.println(output);
		}
		 
		} catch (ClientProtocolException e) {
		e.printStackTrace();
		 
		} catch (IOException e) {
		e.printStackTrace();
		}
		}
		
	
}
