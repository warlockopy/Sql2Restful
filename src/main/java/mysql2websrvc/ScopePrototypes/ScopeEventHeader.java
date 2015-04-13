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
}
