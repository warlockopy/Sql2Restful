package mysql2websrvc.ScopePrototypes;

public class ScopeMainPowerHigh {
	
	public ScopeEventHeader header;
	
	public ScopeMainPowerHigh (){
		header = new ScopeEventHeader ();
	}
	
	public void setHeader (final ScopeEventHeader tmp){
		header.copyHeader(tmp);
	}
}
