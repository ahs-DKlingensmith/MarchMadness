/*
 * Team class
 */

import java.util.ArrayList;

public class Team {
    
    //Establish attributes
    private String name;
    private String mascot;
    private String region;
    private int seed;
    private int powerRanking;
    
    //Default Team constructor
    public Team()   {
        
    }
    
    //The Team constructor accepts arguments for each of the Team's attributes
    public Team(String n, String m, String r, int s, int pr)    {
        
        name = n;
        mascot = m;
        region = r;
        seed = s;
        powerRanking = pr;
        
    }
    
    //The Team constructor accepts arguments for the Team's name, seed, and 
    //powerRanking
    public Team(String n, int s, int pr)    {
        
        name = n;
        seed = s;
        powerRanking = pr;
        
    }
    
    //The setInfo method accepts and stores arguments for each of the Team's
    //attributes
    public void setInfo(String n, String m, String r, int s, int pr)    {
        
        name = n;
        mascot = m;
        region = r;
        seed = s;
        powerRanking = pr;
        
    }
    
    //The getName method returns the name field of the Team object
    public String getName() {
        
        return name;
        
    }
    
    //The getMascot method returns the mascot field of the Team object
    public String getMascot()   {
        
        return mascot;
        
    }
    
    //The getRegion method returns the region field of the Team object
    public String getRegion()   {
        
        return region;
        
    }
    
    //The getSeed method returns the seed field of the Team object
    public int getSeed()    {
        
        return seed;
        
    }
    
    //The getPowerRanking method returns the powerRanking field of the Team
    //object
    public int getPowerRanking()    {
        
        return powerRanking;
        
    }
    
    
    
  
   
}
