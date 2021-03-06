package mysql2websrvc;

public class Inputs
{
    private String input3;

    private String input2;

    private String input5;

    private String input4;

    private String input7;

    private String input6;

    private String ignition;

    private String input1;

    public String getInput3 ()
    {
        return input3;
    }

    public void setInput3 (String input3)
    {
        this.input3 = input3;
    }

    public String getInput2 ()
    {
        return input2;
    }

    public void setInput2 (String input2)
    {
        this.input2 = input2;
    }

    public String getInput5 ()
    {
        return input5;
    }

    public void setInput5 (String input5)
    {
        this.input5 = input5;
    }

    public String getInput4 ()
    {
        return input4;
    }

    public void setInput4 (String input4)
    {
        this.input4 = input4;
    }

    public String getInput7 ()
    {
        return input7;
    }

    public void setInput7 (String input7)
    {
        this.input7 = input7;
    }

    public String getInput6 ()
    {
        return input6;
    }

    public void setInput6 (String input6)
    {
        this.input6 = input6;
    }

    public String getIgnition ()
    {
        return ignition;
    }

    public void setIgnition (String ignition)
    {
        this.ignition = ignition;
    }

    public String getInput1 ()
    {
        return input1;
    }

    public void setInput1 (String input1)
    {
        this.input1 = input1;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [input3 = "+input3+", input2 = "+input2+", input5 = "+input5+", input4 = "+input4+", input7 = "+input7+", input6 = "+input6+", ignition = "+ignition+", input1 = "+input1+"]";
    }
    
    public int toInteger (){
    	int bit0 = getIgnition().compareTo("on") == 0 ? 1 : 0;
		int bit1 = getInput1().compareTo("on") == 0 ? 1 : 0;
		int bit2 = getInput2().compareTo("on") == 0 ? 1 : 0;
		int bit3 = getInput3().compareTo("on") == 0 ? 1 : 0;
		int bit4 = getInput4().compareTo("on") == 0 ? 1 : 0;
		int bit5 = getInput5().compareTo("on") == 0 ? 1 : 0;
		int bit6 = getInput6().compareTo("on") == 0 ? 1 : 0;
		int bit7 = getInput7().compareTo("on") == 0 ? 1 : 0;
    	
		int ans = (bit7 << 7) + (bit6 << 6) + (bit5 << 5) + (bit4 << 4);
		ans += (bit3 << 3) + (bit2 << 2) + (bit1 << 1) + bit0;
		
		return ans;
    }
}