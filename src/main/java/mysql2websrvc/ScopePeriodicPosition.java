package mysql2websrvc;

public class ScopePeriodicPosition {
	public ScopeEventHeader header;
	public int rpm;
	public int trip_duration_seconds;
	public int trip_distance_meters;
	
	public ScopePeriodicPosition (){
		header = new ScopeEventHeader ();
	}
}
