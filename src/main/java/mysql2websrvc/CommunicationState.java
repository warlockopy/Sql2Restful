package mysql2websrvc;

public class CommunicationState
{
    private String networkService;

    private String t3GNetwork;

    private String connected;

    private String dataService;

    private String available;

    private String roaming;

    private String voiceCallIsActive;

    public String getNetworkService ()
    {
        return networkService;
    }

    public void setNetworkService (String networkService)
    {
        this.networkService = networkService;
    }

    public String get3GNetwork ()
    {
        return t3GNetwork;
    }

    public void set3GNetwork (String t3GNetwork)
    {
        this.t3GNetwork = t3GNetwork;
    }

    public String getConnected ()
    {
        return connected;
    }

    public void setConnected (String connected)
    {
        this.connected = connected;
    }

    public String getDataService ()
    {
        return dataService;
    }

    public void setDataService (String dataService)
    {
        this.dataService = dataService;
    }

    public String getAvailable ()
    {
        return available;
    }

    public void setAvailable (String available)
    {
        this.available = available;
    }

    public String getRoaming ()
    {
        return roaming;
    }

    public void setRoaming (String roaming)
    {
        this.roaming = roaming;
    }

    public String getVoiceCallIsActive ()
    {
        return voiceCallIsActive;
    }

    public void setVoiceCallIsActive (String voiceCallIsActive)
    {
        this.voiceCallIsActive = voiceCallIsActive;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [networkService = "+networkService+", 3GNetwork = "+t3GNetwork+", connected = "+connected+", dataService = "+dataService+", available = "+available+", roaming = "+roaming+", voiceCallIsActive = "+voiceCallIsActive+"]";
    }
}
			
			
