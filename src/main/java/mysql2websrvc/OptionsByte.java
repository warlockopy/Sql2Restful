package mysql2websrvc;

public class OptionsByte
{
    private String forwarding;

    private String mobileId;

    private String authenticationWord;

    private String responseRedirection;

    private String bit6;

    private String mobileIdType;

    private String routing;

    private String optionsHeader;

    public String getForwarding ()
    {
        return forwarding;
    }

    public void setForwarding (String forwarding)
    {
        this.forwarding = forwarding;
    }

    public String getMobileId ()
    {
        return mobileId;
    }

    public void setMobileId (String mobileId)
    {
        this.mobileId = mobileId;
    }

    public String getAuthenticationWord ()
    {
        return authenticationWord;
    }

    public void setAuthenticationWord (String authenticationWord)
    {
        this.authenticationWord = authenticationWord;
    }

    public String getResponseRedirection ()
    {
        return responseRedirection;
    }

    public void setResponseRedirection (String responseRedirection)
    {
        this.responseRedirection = responseRedirection;
    }

    public String getBit6 ()
    {
        return bit6;
    }

    public void setBit6 (String bit6)
    {
        this.bit6 = bit6;
    }

    public String getMobileIdType ()
    {
        return mobileIdType;
    }

    public void setMobileIdType (String mobileIdType)
    {
        this.mobileIdType = mobileIdType;
    }

    public String getRouting ()
    {
        return routing;
    }

    public void setRouting (String routing)
    {
        this.routing = routing;
    }

    public String getOptionsHeader ()
    {
        return optionsHeader;
    }

    public void setOptionsHeader (String optionsHeader)
    {
        this.optionsHeader = optionsHeader;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [forwarding = "+forwarding+", mobileId = "+mobileId+", authenticationWord = "+authenticationWord+", responseRedirection = "+responseRedirection+", bit6 = "+bit6+", mobileIdType = "+mobileIdType+", routing = "+routing+", optionsHeader = "+optionsHeader+"]";
    }
}
