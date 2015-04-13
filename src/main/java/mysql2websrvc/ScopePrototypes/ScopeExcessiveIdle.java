package mysql2websrvc.ScopePrototypes;

public class ScopeExcessiveIdle {
	
	public ScopeEventHeader header;
	public int rpm;
	public int duration_seconds;
	
	public ScopeExcessiveIdle (){
		header = new ScopeEventHeader ();
	}

}
