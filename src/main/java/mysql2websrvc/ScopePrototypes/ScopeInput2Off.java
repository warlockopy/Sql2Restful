package mysql2websrvc.ScopePrototypes;

public class ScopeInput2Off {
	
	public ScopeEventHeader header;
	public int duration_seconds;
	public int delay_seconds;
	
	public ScopeInput2Off (){
		header = new ScopeEventHeader ();
	}
	
}
