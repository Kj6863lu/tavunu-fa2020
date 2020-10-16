<<<<<<< HEAD

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
        birthdate = Integer.MIN_VALUE;
        pavaamnt = 0;
    }
    Tavunu(String a, int b, int c)
    {
        name = a;
        birthdate = b;
        pavaamnt = c; 
    }
    

    public Boolean setName(String newname)
    {
        Boolean nameright = true;
        char first;
        if(!newname.isEmpty())
        {
            first = (newname.charAt(0));
            
            if((first == ('T')) || (first == ('D')))
            {
                name = newname;
                return nameright;
            
            }
            else
            {
                nameright = false;
                return nameright;
            }
        }
        else{
            nameright = false;
            return nameright;
        }
    }
        
    public String getName()
    {
        return name;
    }
    public Boolean spendPava(int amount)
    {
        Boolean spend = true;
        if(amount < 0)
        {
            spend = false;
            return spend;
        }
        else
        {
            pavaamnt -= amount;
            spend = true;
            return spend;
        }

    }
    public Boolean receivePava(int amount)
    {
        Boolean give = true;
        if(amount < 0)
        {
            give = false;
            return give;
        }
        else
        {
            pavaamnt += amount;
            give = true;
            return give;
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
        return (name + " born in " + birthdate + " has " + pavaamnt + " pava." );
    }
}
=======

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
        birthdate = Integer.MIN_VALUE;
        pavaamnt = 0;
    }
    Tavunu(String a, int b, int c)
    {
        name = a;
        birthdate = b;
        pavaamnt = c; 
    }
    

    public Boolean setName(String newname)
    {
        Boolean nameright = true;
        char first;
        if(!newname.isEmpty())
        {
            first = (newname.charAt(0));
            
            if((first == ('T')) || (first == ('D')))
            {
                name = newname;
                return nameright;
            
            }
            else
            {
                nameright = false;
                return nameright;
            }
        }
        else{
            nameright = false;
            return nameright;
        }
    }
        
    public String getName()
    {
        return name;
    }
    public Boolean spendPava(int amount)
    {
        Boolean spend = true;
        if(amount < 0)
        {
            spend = false;
            return spend;
        }
        else
        {
            pavaamnt -= amount;
            spend = true;
            return spend;
        }

    }
    public Boolean receivePava(int amount)
    {
        Boolean give = true;
        if(amount < 0)
        {
            give = false;
            return give;
        }
        else
        {
            pavaamnt += amount;
            give = true;
            return give;
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
        return (name + " born in " + birthdate + " has " + pavaamnt + " pava." );
    }
}
>>>>>>> 0a661ada64ed5700132b5d3daac92bb3b52fa1bb
