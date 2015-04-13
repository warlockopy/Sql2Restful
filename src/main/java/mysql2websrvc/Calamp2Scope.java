package mysql2websrvc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import mysql2websrvc.ScopePrototypes.ScopePeriodicPosition;

import com.google.gson.Gson;

public class Calamp2Scope {
public static String Migrate(ArrayList <DataObject> datos) throws ParseException {
	String jsonstringfinal = "";
	ScopePeriodicPosition perpostmp = new ScopePeriodicPosition ();
	MessageContents calampmsg;
	Gson gson = new Gson ();
	
	
	ResponsePrototype response = new ResponsePrototype ();

	
	for (int i=0; i < datos.size(); i++){
		MessagesPostPrototype msgtmp = new MessagesPostPrototype ();
		calampmsg = datos.get(i).getMessageContents();
		
		String unitid = datos.get(i).getOptionsHeader().getMobileId(); 
		perpostmp.header.UnitId = unitid;
		msgtmp.setUnitId(unitid);
		msgtmp.setTemplateId(1);
		perpostmp.header.Description = "PeriodicPosition";
		
		SimpleDateFormat sdfu  = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
	    Date udate = sdfu.parse(calampmsg.getTimeOfFix());
	    
	    long timeInMillisSinceEpoch123 = udate.getTime(); 
	    long durationinSeconds2 = timeInMillisSinceEpoch123 / 1000;
		perpostmp.header.UtcTimestampSeconds = durationinSeconds2;
		
		perpostmp.header.Latitude = Double.parseDouble(calampmsg.getLatitude());
		perpostmp.header.Longitude = Double.parseDouble(calampmsg.getLongitude());
		
		StringTokenizer st = new StringTokenizer (calampmsg.getSpeed ());
		perpostmp.header.Speed = (int) Double.parseDouble (st.nextToken ());
		
		perpostmp.header.Direction = Integer.parseInt(calampmsg.getHeading());
		perpostmp.header.Odometer = 0;
		
		int bit0 = calampmsg.getInputs().getIgnition().compareTo("on") == 0 ? 1 : 0;
		int bit1 = calampmsg.getInputs().getInput1().compareTo("on") == 0 ? 1 : 0;
		int bit2 = calampmsg.getInputs().getInput2().compareTo("on") == 0 ? 1 : 0;
		int bit3 = calampmsg.getInputs().getInput3().compareTo("on") == 0 ? 1 : 0;
		int bit4 = calampmsg.getInputs().getInput4().compareTo("on") == 0 ? 1 : 0;
		int bit5 = calampmsg.getInputs().getInput5().compareTo("on") == 0 ? 1 : 0;
		int bit6 = calampmsg.getInputs().getInput6().compareTo("on") == 0 ? 1 : 0;
		int bit7 = calampmsg.getInputs().getInput7().compareTo("on") == 0 ? 1 : 0;
		
		perpostmp.header.InputStatus = (bit7 << 7) + (bit6 << 6) + (bit5 << 5) + (bit4 << 4)
				        + (bit3 << 3) + (bit2 << 2) + (bit1 << 1) + bit0;
		
		//perpostmp.header.OutputStatus = 
		perpostmp.header.Source = 0;
		perpostmp.header.TemplateId = 1;
		
		msgtmp.setBody(perpostmp);
		
		response.addMessage(msgtmp);
		
	}
	jsonstringfinal = gson.toJson (response);
	return jsonstringfinal;
}
}
