package mysql2websrvc.ScopePrototypes;

public class ScopeEngineStop {
	public ScopeEventHeader header;
	
	public ScopeEngineStop (){
		header = new ScopeEventHeader ();
	}
	
	public void setHeader (final ScopeEventHeader tmp){
		header.copyHeader(tmp);
	}
}
