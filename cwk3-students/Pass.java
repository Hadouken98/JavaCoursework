
/**
 * A Pass has an id number, name, a luxury rating,
 * number of credits and journey points
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pass 
{
   private int PassID;
   private String Name;
   private int Rating;
   private int CreditNum;
   private int JourneyPoints;
   

   public Pass(int pID, String n, int Rating, int CreditNum, int JourneyPoints)
   {
      PassID = pID;
      Name = n;
      Rating = 1;
      CreditNum = 100;
      JourneyPoints = 0;
   }
    
   //constructor
 
   
   
   //methods
   public String getName()
   {
       return Name;
   }
   
   public int getPassID()
   {
       return PassID;
   }
   
   public void decrementCredits()
   {
      CreditNum = CreditNum - 1;
   }
   
   public void incrementJourneyPoints(){JourneyPoints = JourneyPoints + 1;}
   
   public String toString()
   {
      String s;
      s = "\nPassID: " + PassID + "  " + Name + "\nRating : "
              + Rating +"\nNumber of Credits: " + CreditNum ;
      return s;
   }
}

