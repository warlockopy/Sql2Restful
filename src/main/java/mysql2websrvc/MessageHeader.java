package mysql2websrvc;

public class MessageHeader
{
    private String messageType;

    private String serviceType;

    private String sequenceNumber;

    public String getMessageType ()
    {
        return messageType;
    }

    public void setMessageType (String messageType)
    {
        this.messageType = messageType;
    }

    public String getServiceType ()
    {
        return serviceType;
    }

    public void setServiceType (String serviceType)
    {
        this.serviceType = serviceType;
    }

    public String getSequenceNumber ()
    {
        return sequenceNumber;
    }

    public void setSequenceNumber (String sequenceNumber)
    {
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [messageType = "+messageType+", serviceType = "+serviceType+", sequenceNumber = "+sequenceNumber+"]";
    }
}
