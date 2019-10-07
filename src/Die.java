import java.util.Random;
public class Die
{
    int sides;
    Random generator = new Random();
    int roll;

    //constructors
    public Die()
    {
        sides = 2;
    }//end of 0-arg
    public Die(int newSides)
    {
        sides = checkSides(newSides);
    }//end of single -arg
    //rolls a random number within the max and min
    public int roll()
    {
        roll = generator.nextInt(sides) + 1;
        return roll;
    }//end of roll
    //getters
    //does not reroll, simply returns the current value of the roll.
    public int getRoll()
    {
        return roll;
    }
    public int getSides()
    {
        return sides;
    }//end of get sides getter
    //setters
    public void setSides(int newSides)
    {
        sides = checkSides(newSides);
    }//end of setSides setter
    public void rigDie(int newRoll)
    {
        roll = checkRiggedRoll(newRoll);
    }//end rigDie setter (also known as setDie)
    //brain methods
    private int checkSides(int newSides)
    {
        int tempSides = newSides;
        if(tempSides < 1)
        {
            tempSides = 2;
        }//end of if
        return tempSides;
    }//end of check sides
    private int checkRiggedRoll(int newRoll)
    {
        int tempRoll = newRoll;
        int tempSides = sides;

        if(tempRoll > tempSides || tempRoll < 1)
        {
            System.out.println("Bro... That's not even possible. You're pretty bad at rigging dice.");
            System.out.println("Here. I'll fix it for ya: ");
            tempRoll = 1;
            System.out.println("Crit fail.");
        }//end if
        return tempRoll;
    }//end of check rigged roll
    //to string
    public String toString()
    {
        String output;
        output = "Die with " + sides + " sides";
        return output;
    }//end of toString
}//end of die class
