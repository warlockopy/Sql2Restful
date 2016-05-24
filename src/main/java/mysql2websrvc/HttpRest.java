package mysql2websrvc;

import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import feedback.HttpOutput;
import feedback.Success;

public class HttpRest {
	public static String urlscope = "https://global.scopemp.net/Scope.MProfiler.ThirdPartyGateway.Api/api/v1/messages";
	public static String ScopeHost = "global.scopemp.net";
	public static String ScopePath = "/Scope.MProfiler.ThirdPartyGateway.Api/api/v1/messages";
	public static String username = "PYLS", password = "Dn1f8C5XeJj42AzG";
	
	
	public static HttpOutput httpsClientC (String datoJson) throws Exception {
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost post = new HttpPost(urlscope);
		String mydatetime, auheader;
		String serverOutputString = "";
		
		mydatetime = MD5.getCurrentTime();
		post.setHeader("Accept", "application/json");
		post.setHeader(HTTP.CONTENT_TYPE, "application/json");
		
		auheader =  username + ":" + password;
		String encodedaut = Base64.encodeBase64String(auheader.getBytes());

		
		post.addHeader("Authorization", "Basic " + encodedaut);
		post.addHeader("date", mydatetime);
		
		StringEntity input = new StringEntity(datoJson);
		input.setContentType("application/json");
		post.setEntity(input);
		int httperr;
		
		
		CloseableHttpResponse response = httpclient.execute(post);
		
		try {
			System.out.println("Http response...");
			System.out.println(response.getProtocolVersion());
			httperr = response.getStatusLine().getStatusCode();
			System.out.println(httperr);
			System.out.println(response.getStatusLine().getReasonPhrase());
			System.out.println ();
			
			BufferedReader br = new BufferedReader(
				new InputStreamReader((response.getEntity().getContent())));

				String output;
				
				System.out.println("Output from Server .... \n");
				
				while ((output = br.readLine()) != null){
					System.out.println(output);
					serverOutputString += output;
				}
			
		} finally {
			response.close();
		}
		
		return new HttpOutput (httperr, serverOutputString);
	}
	
	public static HttpOutput send (String jsonString){
		HttpOutput ans = null;
		
		try {
			ans = httpsClientC (jsonString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ans;
	}
	
	public static HttpOutput send (ResponsePrototype response){
		String jsonString = new Gson().toJson (response);
		
		return send (jsonString);
	}
	
	public static String makesignature(String apikey, String stringtosign) {
		
		return "";
	}
	
	public static String string2signCC(String content, String datetime){
		
		return "POST" + "|" + MD5.getMD5(content) + "|" + "application/json" + "|" + datetime + "|" + urlscope;
	} 
	
	public static void HttpsApacheClientAuth(String dato) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpHost targethost = new HttpHost(ScopeHost, 80, "http");
		CloseableHttpResponse response = null;
		
		CredentialsProvider credsProvider = new BasicCredentialsProvider();
		credsProvider.setCredentials(
				new AuthScope(targethost.getHostName(), targethost.getPort()),
				new UsernamePasswordCredentials(username, password));
		AuthCache authcache = new BasicAuthCache();
		BasicScheme basicAuth = new BasicScheme();
		authcache.put(targethost, basicAuth);
		//Agregar el cache al contexto de la ejecucion
		HttpClientContext context = HttpClientContext.create();
		context.setCredentialsProvider(credsProvider);
		context.setAuthCache(authcache);
		
		HttpPost post = new HttpPost(ScopePath);
		 
		for (int i = 0; i < 3; i++){
			try {
				response = httpclient.execute(targethost, post, context);
				System.out.println("Respuesta del servidor");
				System.out.println(response.getProtocolVersion());
				System.out.println(response.getStatusLine().getStatusCode());
				System.out.println(response.getStatusLine().getReasonPhrase());
				HttpEntity entity = response.getEntity();
			} finally {
				response.close();
			}
		}			
	}
	
	public static String sendSingleCalampMessage (final String calampMessage){
		DataObject dObj = ReadJsonFromMySql.json2Obj(calampMessage);
		ArrayList <DataObject> data = new ArrayList ();
		data.add (dObj);
		Success success;
		String ans = "";
		
		try {
			success = Calamp2Scope.toScopeString(data);
			String scope = success.getScopeString();
			HttpOutput out = HttpRest.httpsClientC(scope);
			ans = out.getOutput ();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		return ans;
	}
}
