  


/**
 * Details of your pair
 * 
 * @author (MohammedRamzan/FazilaFazal)
 * @version (29/12/22)
 */
public class Teamwork
{
    private String[] details = new String[6];
    
    public Teamwork()
    {   // In each line replace the contents of the String 
        // with the details of your team
        // It will help us if the surname of programmer1 comes
        // alphabetically before the surname of programmer2
        // If there is only 1 team member, please complete details 
        // for programmer1
        
        details[0] = "Fazal";
        details[1] = "Fazila";
        details[2] = "21001715";
        details[3] = "Ramzan";
        details[4] = "Mohammed";
        details[5] = "20056626";
    }
    
    public String[] getTeamDetails()
    {
        return details;
    }
    
    public void displayDetails()
    {
        for(String temp:details)
        {
            System.out.println(temp.toString());
        }
    }
}
        
