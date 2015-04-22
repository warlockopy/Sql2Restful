package mysql2websrvc.ScopePrototypes;

public class ScopeNonTripPosition {
	public ScopeEventHeader header;
	public int sms_count;
	
	public ScopeNonTripPosition (){
		header = new ScopeEventHeader ();
	}
	
	public void setHeader (final ScopeEventHeader tmp){
		header.copyHeader(tmp);
	}
}
