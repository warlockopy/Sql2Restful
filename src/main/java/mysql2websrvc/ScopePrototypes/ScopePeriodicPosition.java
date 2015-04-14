package mysql2websrvc.ScopePrototypes;

public class ScopePeriodicPosition {
	public ScopeEventHeader header;
	public int rpm;
	public int trip_duration_seconds;
	public int trip_distance_meters;
	
	public ScopePeriodicPosition (){
		header = new ScopeEventHeader ();
	}
	
	public ScopePeriodicPosition (final ScopeEventHeader tmp){
		header = new ScopeEventHeader (tmp);
	}
	
	public void setHeader (final ScopeEventHeader tmp){
		header.copyHeader(tmp);
	}
}
