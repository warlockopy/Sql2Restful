package mysql2websrvc;

public class UnitStatus
{
    private String gpsAntennaStatus;

    private String gpsReceiverTracking;

    private String gpsReceiverSelfTest;

    private String bit5;

    private String httpOtaUpdateStatus;

    private String bit6;

    private String bit4;

    public String getGpsAntennaStatus ()
    {
        return gpsAntennaStatus;
    }

    public void setGpsAntennaStatus (String gpsAntennaStatus)
    {
        this.gpsAntennaStatus = gpsAntennaStatus;
    }

    public String getGpsReceiverTracking ()
    {
        return gpsReceiverTracking;
    }

    public void setGpsReceiverTracking (String gpsReceiverTracking)
    {
        this.gpsReceiverTracking = gpsReceiverTracking;
    }

    public String getGpsReceiverSelfTest ()
    {
        return gpsReceiverSelfTest;
    }

    public void setGpsReceiverSelfTest (String gpsReceiverSelfTest)
    {
        this.gpsReceiverSelfTest = gpsReceiverSelfTest;
    }

    public String getBit5 ()
    {
        return bit5;
    }

    public void setBit5 (String bit5)
    {
        this.bit5 = bit5;
    }

    public String getHttpOtaUpdateStatus ()
    {
        return httpOtaUpdateStatus;
    }

    public void setHttpOtaUpdateStatus (String httpOtaUpdateStatus)
    {
        this.httpOtaUpdateStatus = httpOtaUpdateStatus;
    }

    public String getBit6 ()
    {
        return bit6;
    }

    public void setBit6 (String bit6)
    {
        this.bit6 = bit6;
    }

    public String getBit4 ()
    {
        return bit4;
    }

    public void setBit4 (String bit4)
    {
        this.bit4 = bit4;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [gpsAntennaStatus = "+gpsAntennaStatus+", gpsReceiverTracking = "+gpsReceiverTracking+", gpsReceiverSelfTest = "+gpsReceiverSelfTest+", bit5 = "+bit5+", httpOtaUpdateStatus = "+httpOtaUpdateStatus+", bit6 = "+bit6+", bit4 = "+bit4+"]";
    }
}
