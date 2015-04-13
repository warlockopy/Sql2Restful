package mysql2websrvc.ScopePrototypes;

public class ScopeExcessiveFreewheeling {
	
	public ScopeEventHeader header;
	public int rpm;
	public int durationSeconds;
	public int distanceMeters;
	
	public ScopeExcessiveFreewheeling (){
		header = new ScopeEventHeader ();
	}

}
