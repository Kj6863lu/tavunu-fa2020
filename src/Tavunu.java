
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
    private int pavaamnt;
    private int birthdate;
    
    public void tavunu()
    {
        
    }
    
    public Boolean setName(String name)
    {
        if(name )
    }
    public String getName()
    {
        return name;
    }
    public Boolean spendPava(int amount)
    {
        if(pavaamnt <= 0)
        {
            return false;
        }
        else
        {
            pavaamnt -= amount;
            return true;
        }
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
    public void setDOB(int date)
    {
        birthdate = date;
    }
    public int getDOB()
    {
        return birthdate;
    }
    public String toString()
    {
        return (name + pavaamnt + birthdate);
    }
}
