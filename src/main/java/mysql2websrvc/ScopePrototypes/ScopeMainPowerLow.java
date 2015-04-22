package mysql2websrvc.ScopePrototypes;

public class ScopeMainPowerLow {

	public ScopeEventHeader header;
	public int duration_seconds;
	public float threshold_volts;
	public float value_volts;
	
	public ScopeMainPowerLow (){
		header = new ScopeEventHeader ();
	}

	public void setHeader (final ScopeEventHeader tmp){
		header.copyHeader(tmp);
	}
}
