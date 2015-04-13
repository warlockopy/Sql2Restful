package mysql2websrvc.ScopePrototypes;

public class ScopeExcessiveAcceleration {
	public ScopeEventHeader header;
	public int acceleration_limit;
	public int maximum_acceleration;
	public int duration_seconds;
	
	public ScopeExcessiveAcceleration (){
		header = new ScopeEventHeader ();
	}

}
