
public class Surgeon extends Doctor{
    private boolean operating;
    
    public Surgeon(String name, int number,String speciality, boolean operating)
    {
        super(name,number,speciality);
        this.operating = operating;
    }
    
    public Surgeon()
    {
        
    }
    
    public boolean getOperating()
    {
        return operating;
    }
    
    public void setOperating(boolean operating)
    {
        this.operating = operating;
    }
    
    @Override
    public String toString()
    {
        return(name+" "+number+" "+speciality+" Operating : "+operating);
    }
    
    @Override
    public void work()
    {
        if(operating==true)
        {
            System.out.println(name+ " works for the hospital. "+name+" is operating now.");
        }
        else
        {
            System.out.println(name+ " works for the hospital. "+name+" is not operating now.");
        }
    }
}

