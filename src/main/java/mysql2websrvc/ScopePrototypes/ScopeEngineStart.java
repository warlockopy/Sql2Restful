package mysql2websrvc.ScopePrototypes;

public class ScopeEngineStart {
	public ScopeEventHeader header;
		
	public ScopeEngineStart (){
		header = new ScopeEventHeader ();
	}

	public void setHeader (final ScopeEventHeader tmp){
		header.copyHeader(tmp);
	}
}
