package mysql2websrvc.ScopePrototypes;

public class ScopeEventHeader {
	public int TemplateId;
	public String UnitId;
	public String Description;
	public long UtcTimestampSeconds;
	public double Latitude;
	public double Longitude;
	public int Speed;
	public int Direction;
	public int Odometer;
	public int InputStatus;
	public int OutputStatus;
	public int DriverKeyCode;
	public int Source;
	public int GeneralStatus;
	public int TripSpeedSource = 0;
	
	public ScopeEventHeader (){
	    
	}
	
	public ScopeEventHeader (final ScopeEventHeader headertmp){
		TemplateId = headertmp.TemplateId;
	    UnitId = headertmp.UnitId;
	    Description = headertmp.Description;
	    UtcTimestampSeconds = headertmp.UtcTimestampSeconds;
	    Latitude = headertmp.Latitude;
	    Longitude = headertmp.Longitude;
	    Speed = headertmp.Speed;
	    Direction = headertmp.Direction;
	    Odometer = headertmp.Odometer;
	    InputStatus = headertmp.InputStatus;
	    OutputStatus = headertmp.OutputStatus;
	    DriverKeyCode = headertmp.DriverKeyCode;
	    Source = headertmp.Source;
	    GeneralStatus = headertmp.GeneralStatus;
	    TripSpeedSource = headertmp.TripSpeedSource;
	}
	
	public void copyHeader (final ScopeEventHeader headertmp){
		TemplateId = headertmp.TemplateId;
	    UnitId = headertmp.UnitId;
	    Description = headertmp.Description;
	    UtcTimestampSeconds = headertmp.UtcTimestampSeconds;
	    Latitude = headertmp.Latitude;
	    Longitude = headertmp.Longitude;
	    Speed = headertmp.Speed;
	    Direction = headertmp.Direction;
	    Odometer = headertmp.Odometer;
	    InputStatus = headertmp.InputStatus;
	    OutputStatus = headertmp.OutputStatus;
	    DriverKeyCode = headertmp.DriverKeyCode;
	    Source = headertmp.Source;
	    GeneralStatus = headertmp.GeneralStatus;
	    TripSpeedSource = headertmp.TripSpeedSource;
	}
}
