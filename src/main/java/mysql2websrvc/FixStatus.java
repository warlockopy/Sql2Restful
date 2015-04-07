package mysql2websrvc;

public class FixStatus
{
    private String differentiallyCorrected;

    private String invalidTime;

    private String t2DFix;

    private String invalidFix;

    private String lastKnown;

    private String predicted;

    private String historic;

    public String getDifferentiallyCorrected ()
    {
        return differentiallyCorrected;
    }

    public void setDifferentiallyCorrected (String differentiallyCorrected)
    {
        this.differentiallyCorrected = differentiallyCorrected;
    }

    public String getInvalidTime ()
    {
        return invalidTime;
    }

    public void setInvalidTime (String invalidTime)
    {
        this.invalidTime = invalidTime;
    }

    public String get2DFix ()
    {
        return t2DFix;
    }

    public void set2DFix (String t2DFix)
    {
        this.t2DFix = t2DFix;
    }

    public String getInvalidFix ()
    {
        return invalidFix;
    }

    public void setInvalidFix (String invalidFix)
    {
        this.invalidFix = invalidFix;
    }

    public String getLastKnown ()
    {
        return lastKnown;
    }

    public void setLastKnown (String lastKnown)
    {
        this.lastKnown = lastKnown;
    }

    public String getPredicted ()
    {
        return predicted;
    }

    public void setPredicted (String predicted)
    {
        this.predicted = predicted;
    }

    public String getHistoric ()
    {
        return historic;
    }

    public void setHistoric (String historic)
    {
        this.historic = historic;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [differentiallyCorrected = "+differentiallyCorrected+", invalidTime = "+invalidTime+", 2DFix = "+t2DFix+", invalidFix = "+invalidFix+", lastKnown = "+lastKnown+", predicted = "+predicted+", historic = "+historic+"]";
    }
}
