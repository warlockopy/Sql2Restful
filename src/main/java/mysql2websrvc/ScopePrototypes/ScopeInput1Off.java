package mysql2websrvc.ScopePrototypes;

public class ScopeInput1Off {
	
	public ScopeEventHeader header;
	public int duration_seconds;
	public int delay_seconds;
	
	public ScopeInput1Off (){
		header = new ScopeEventHeader ();
	}
	
}
