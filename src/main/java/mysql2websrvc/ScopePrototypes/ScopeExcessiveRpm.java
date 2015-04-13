package mysql2websrvc.ScopePrototypes;

public class ScopeExcessiveRpm {
	
	public ScopeEventHeader header;
	public int rpm_limit;
	public int maximum_rpm;
	public int duration_seconds;
	
	public ScopeExcessiveRpm (){
		header = new ScopeEventHeader ();
	}
}
