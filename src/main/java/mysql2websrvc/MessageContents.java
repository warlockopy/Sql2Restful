package mysql2websrvc;

public class MessageContents
{
    private String horizontalDilutionOfPrecision;

    private String[] accumulators;

    private String receivedSignalStrengthIndication;

    private String updateTime;

    private String speed;

    private String altitude;

    private FixStatus fixStatus;

    private String timeOfFix;

    private CommunicationState communicationState;

    private String eventIndex;

    private UnitStatus unitStatus;

    private Inputs inputs;

    private String eventCode;

    private String carrier;

    private String longitude;

    private String latitude;

    private String accumulatorsCount;

    private String satellites;

    private String heading;

    public String getHorizontalDilutionOfPrecision ()
    {
        return horizontalDilutionOfPrecision;
    }

    public void setHorizontalDilutionOfPrecision (String horizontalDilutionOfPrecision)
    {
        this.horizontalDilutionOfPrecision = horizontalDilutionOfPrecision;
    }

    public String[] getAccumulators ()
    {
        return accumulators;
    }

    public void setAccumulators (String[] accumulators)
    {
        this.accumulators = accumulators;
    }

    public String getReceivedSignalStrengthIndication ()
    {
        return receivedSignalStrengthIndication;
    }

    public void setReceivedSignalStrengthIndication (String receivedSignalStrengthIndication)
    {
        this.receivedSignalStrengthIndication = receivedSignalStrengthIndication;
    }

    public String getUpdateTime ()
    {
        return updateTime;
    }

    public void setUpdateTime (String updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getSpeed ()
    {
        return speed;
    }

    public void setSpeed (String speed)
    {
        this.speed = speed;
    }

    public String getAltitude ()
    {
        return altitude;
    }

    public void setAltitude (String altitude)
    {
        this.altitude = altitude;
    }

    public FixStatus getFixStatus ()
    {
        return fixStatus;
    }

    public void setFixStatus (FixStatus fixStatus)
    {
        this.fixStatus = fixStatus;
    }

    public String getTimeOfFix ()
    {
        return timeOfFix;
    }

    public void setTimeOfFix (String timeOfFix)
    {
        this.timeOfFix = timeOfFix;
    }

    public CommunicationState getCommunicationState ()
    {
        return communicationState;
    }

    public void setCommunicationState (CommunicationState communicationState)
    {
        this.communicationState = communicationState;
    }

    public String getEventIndex ()
    {
        return eventIndex;
    }

    public void setEventIndex (String eventIndex)
    {
        this.eventIndex = eventIndex;
    }

    public UnitStatus getUnitStatus ()
    {
        return unitStatus;
    }

    public void setUnitStatus (UnitStatus unitStatus)
    {
        this.unitStatus = unitStatus;
    }

    public Inputs getInputs ()
    {
        return inputs;
    }

    public void setInputs (Inputs inputs)
    {
        this.inputs = inputs;
    }

    public String getEventCode ()
    {
        return eventCode;
    }

    public void setEventCode (String eventCode)
    {
        this.eventCode = eventCode;
    }

    public String getCarrier ()
    {
        return carrier;
    }

    public void setCarrier (String carrier)
    {
        this.carrier = carrier;
    }

    public String getLongitude ()
    {
        return longitude;
    }

    public void setLongitude (String longitude)
    {
        this.longitude = longitude;
    }

    public String getLatitude ()
    {
        return latitude;
    }

    public void setLatitude (String latitude)
    {
        this.latitude = latitude;
    }

    public String getAccumulatorsCount ()
    {
        return accumulatorsCount;
    }

    public void setAccumulatorsCount (String accumulatorsCount)
    {
        this.accumulatorsCount = accumulatorsCount;
    }

    public String getSatellites ()
    {
        return satellites;
    }

    public void setSatellites (String satellites)
    {
        this.satellites = satellites;
    }

    public String getHeading ()
    {
        return heading;
    }

    public void setHeading (String heading)
    {
        this.heading = heading;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [horizontalDilutionOfPrecision = "+horizontalDilutionOfPrecision+", accumulators = "+accumulators+", receivedSignalStrengthIndication = "+receivedSignalStrengthIndication+", updateTime = "+updateTime+", speed = "+speed+", altitude = "+altitude+", fixStatus = "+fixStatus+", timeOfFix = "+timeOfFix+", communicationState = "+communicationState+", eventIndex = "+eventIndex+", unitStatus = "+unitStatus+", inputs = "+inputs+", eventCode = "+eventCode+", carrier = "+carrier+", longitude = "+longitude+", latitude = "+latitude+", accumulatorsCount = "+accumulatorsCount+", satellites = "+satellites+", heading = "+heading+"]";
    }
}
