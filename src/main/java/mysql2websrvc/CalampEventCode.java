package mysql2websrvc;

public class CalampEventCode {
	public static final int NonTripPosition = 6;
	public static final int PeriodicReport = 10; 	//Scope PeriodicPosition
	public static final int IgnitionOn = 11; 		//Scope EngnineStart
	public static final int IgnitionOff = 12; 		//Scope EngineStop
	public static final int NotMovingSReport = 13;
	public static final int Input2Event = 14;
	public static final int Input1Event = 15;
	public static final int Input0Event = 16;
	public static final int Input1High = 17;
	public static final int Input2High = 19;
	public static final int OnMainPower = 24; 		//Scope MainPowerHigh
	public static final int OffMainPower = 25; 		//Scope MainPowerLow
	public static final int BatteryLow = 26; 		//Scope BatteryLow
	public static final int CustomEvent = 27;		//Falso contacto
	public static final int NotInUseReport = 30;
	public static final int Idle = 36;				//Scope StartOfExcessiveIdle
	public static final int ExcessiveIdle = 37; 	//Scope ExcessiveIdle
	public static final int OverSpeed = 40;
	public static final int Towing = 41;
	public static final int OneHourReport = 44;
	public static final int SpeedBelow = 39;
	public static final int CommConnect = 45;
	public static final int Input1Transition = 51;
	public static final int Input2Transition = 52;
	public static final int WakefromSleep = 20;
	public static final int FirstMotion = 21;
	public static final int BeginingOfDrive = 31;
	public static final int EndOfDrive = 32;
	public static final int JammingDetected = 60;
	public static final int Input4Low = 70;
	public static final int Input4High = 71;
	public static final int Input5Low = 72;
	public static final int Input5High = 73;
	public static final int RapidAcceleration = 80;
	public static final int HarshBrake = 81;
	public static final int LeftCornering = 82;
	public static final int RightCornering = 83;
	public static final int GpsLost = 96;
	
}


