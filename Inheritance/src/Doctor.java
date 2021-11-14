
public class Doctor extends HospitalEmployee{
    protected String speciality;
    
    public Doctor(String name, int number, String speciality)
    {
        super(name,number);
        this.speciality = speciality;
    }
    
    public Doctor()
    {
        
    }
    
    public String getSpeciality()
    {
        return speciality;
    }
    
    public void setSpeciality(String speciality)
    {
        this.speciality = speciality;
    }
    
    @Override
    public String toString()
    {
        return(name+" "+number+" "+speciality);
    }
    
    @Override
     public void work()
    {
        System.out.println(name+ " works for the hospital. "+name+" is a(n) " +speciality+" doctor.");
    }
}
