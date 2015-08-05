package mysql2websrvc;

public class ScopeTemplateIdAndDescription {
	
	private int templateId;
	private String description;
	
	public ScopeTemplateIdAndDescription (int calampEventCode){
		
		switch (calampEventCode){
			case CalampEventCode.PeriodicReport:
				templateId = ScopeEventCode.PeriodicPosition;
				description = "PeriodicPosition";
				break;
				
			case CalampEventCode.BatteryLow:
				templateId = ScopeEventCode.BatteryLow;
				description = "BatteryLow";
				break;
				
			case CalampEventCode.IgnitionOn:
				templateId = ScopeEventCode.EngineStart;
				description = "EngineStart";
				break;
				
			case CalampEventCode.IgnitionOff:
				templateId = ScopeEventCode.EngineStop;
				description = "EngineStop";
				break;
				
			case CalampEventCode.NotMovingSReport:
				templateId =  ScopeEventCode.NonTripPosition;
				description = "NonTripPosition";
				break;
				
			case CalampEventCode.ExcessiveIdle:
				templateId = ScopeEventCode.ExcessiveIdle;
				description = "ExcessiveIdle";
				break;
				
			case CalampEventCode.BeginingOfDrive:
				templateId = ScopeEventCode.TripStartup;
				description = "TripStartup";
				break;
				
			case CalampEventCode.EndOfDrive:
				templateId = ScopeEventCode.TripShutdown;
				description = "TripShutdown";
				break;
			
				
			case CalampEventCode.OnMainPower:
				templateId = ScopeEventCode.MainPowerHigh;
				description = "MainPowerHigh";
				break;
				
			case CalampEventCode.OffMainPower:
				templateId = ScopeEventCode.MainPowerLow;
				description = "MainPowerLow";
				break;
				
			case CalampEventCode.Idle:
				templateId = ScopeEventCode.StartOfExcessiveIdle;
				description = "StartOfExcessiveIdle";
				break;
					
			default:
				templateId = ScopeEventCode.UnknownEvent;
				description = "UnknownEvent";
		}
		
	}
	
	public int getTemplateId (){
		return templateId;
	}
	
	public String getDescription (){
		return description;
	}

}
