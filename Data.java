package posist;

public class Data 
{
	String name,address,mobileno;
    float value;

    //Default Constructor
    public Data()
    {
    }

    //constructor building
    public Data(String name, String address, String mobileno, float value)
    {
        this.name = name;
        this.address = address;
        this.mobileno = mobileno;
        this.value = value;
    }

    //getter setter Methods
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getMobileno()
    {
        return mobileno;
    }

    public void setMobileno(String mobileno)
    {
        this.mobileno = mobileno;
    }

    public float getValue()
    {
        return value;
    }

    public void setValue(float value)
    {
        this.value = value;
    }
}
