package mysql2websrvc;

public class DataObject
{
    private MessageContents messageContents;

    private MessageHeader messageHeader;

    private OptionsHeader optionsHeader;

    public MessageContents getMessageContents ()
    {
        return messageContents;
    }

    public void setMessageContents (MessageContents messageContents)
    {
        this.messageContents = messageContents;
    }

    public MessageHeader getMessageHeader ()
    {
        return messageHeader;
    }

    public void setMessageHeader (MessageHeader messageHeader)
    {
        this.messageHeader = messageHeader;
    }

    public OptionsHeader getOptionsHeader ()
    {
        return optionsHeader;
    }

    public void setOptionsHeader (OptionsHeader optionsHeader)
    {
        this.optionsHeader = optionsHeader;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [messageContents = "+ messageContents + ", messageHeader = " + 
        		messageHeader + ", optionsHeader = " + optionsHeader + "]";
    }
}
