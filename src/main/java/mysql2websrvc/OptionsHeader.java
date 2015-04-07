package mysql2websrvc;

public class OptionsHeader
{
    private String mobileIdTypeLength;

    private String mobileId;

    private String mobileIdLength;

    private OptionsByte optionsByte;

    private String mobileIdType;

    public String getMobileIdTypeLength ()
    {
        return mobileIdTypeLength;
    }

    public void setMobileIdTypeLength (String mobileIdTypeLength)
    {
        this.mobileIdTypeLength = mobileIdTypeLength;
    }

    public String getMobileId ()
    {
        return mobileId;
    }

    public void setMobileId (String mobileId)
    {
        this.mobileId = mobileId;
    }

    public String getMobileIdLength ()
    {
        return mobileIdLength;
    }

    public void setMobileIdLength (String mobileIdLength)
    {
        this.mobileIdLength = mobileIdLength;
    }

    public OptionsByte getOptionsByte ()
    {
        return optionsByte;
    }

    public void setOptionsByte (OptionsByte optionsByte)
    {
        this.optionsByte = optionsByte;
    }

    public String getMobileIdType ()
    {
        return mobileIdType;
    }

    public void setMobileIdType (String mobileIdType)
    {
        this.mobileIdType = mobileIdType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [mobileIdTypeLength = "+mobileIdTypeLength+", mobileId = "+mobileId+", mobileIdLength = "+mobileIdLength+", optionsByte = "+optionsByte+", mobileIdType = "+mobileIdType+"]";
    }
}
