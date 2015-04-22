package mysql2websrvc.ScopePrototypes;

public class ScopeBatteryLow {

	public ScopeEventHeader header;
	public int temperature;
	public int voltage;
	public int battery_age;
	public int charge_level_percentage;
	
	public ScopeBatteryLow (){
		header = new ScopeEventHeader ();
	}
	
	public void setHeader (final ScopeEventHeader tmp){
		header.copyHeader(tmp);
	}
}
