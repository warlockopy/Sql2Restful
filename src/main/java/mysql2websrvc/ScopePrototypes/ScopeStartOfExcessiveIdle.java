package mysql2websrvc.ScopePrototypes;

public class ScopeStartOfExcessiveIdle {
	
	public ScopeEventHeader header;
	
	public ScopeStartOfExcessiveIdle (){
		header = new ScopeEventHeader ();
	}

	public void setHeader (final ScopeEventHeader tmp){
		header.copyHeader(tmp);
	}
}
