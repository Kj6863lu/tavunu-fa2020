
/**
 * A tavunu is an imaginary Earth-dwelling being.
 *
 * A tavunu looks a bit like a Patagonian Mara and lives in a non-gendered but
 * hierarchical society. Most interactions among tavuni are negotiated with
 * pava -- items of status used for bargaining.
 *
 * @author Mithat Konar
 * @author Paul Larson
 */
public class Tavunu {
    private String name;
    private int birthdate;
    private int pavaamnt;
    
    public Tavunu()
    {
        name = "";
        birthdate = 0;
        pavaamnt = 0;
    }
    Tavunu(String a, int b, int c)
    {
        name = a;
        birthdate = b;
        pavaamnt = c; 
    }
    
    public void Tavunu()
    {
        
    }
   
    public Boolean setName(String name)
    {
       
        {
            
        }
        return true;
    }
    public String getName()
    {
        return name;
    }
    public Boolean spendPava(int amount)
    {
        if(pavaamnt > 0)
        {
            pavaamnt = pavaamnt - amount;
            return true;
        }
        return false;

    }
    public Boolean receivePava(int amount)
    {
        if(pavaamnt <= 0)
        {
            return false;
        }
        else
        {
            pavaamnt += amount;
            return true;
        }
    }
    public int getPava()
    {
        return pavaamnt;
    }
    public void setBirthYear(int date)
    {
        birthdate = date;
    }
    public int getBirthYear()
    {
        return birthdate;
    }
    public String toString()
    {
        return (name + pavaamnt + birthdate);
    }
}
