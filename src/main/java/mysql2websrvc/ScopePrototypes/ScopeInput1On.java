package mysql2websrvc.ScopePrototypes;

public class ScopeInput1On {
	
	public ScopeEventHeader header;
	public int duration_seconds;
	public int delay_seconds;
	
	public ScopeInput1On (){
		header = new ScopeEventHeader ();
	}
	
}
