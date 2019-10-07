import java.util.Scanner;

public class DieDriver
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of sides for you die: ");
        int userSides = keyboard.nextInt();
        Die userDie = new Die(userSides);
        userDie.roll();
        //userDie.rigDie(5);
        System.out.println("You rolled a: " + userDie.getRoll());


        //System.out.println(userDie);
        //testing
       // System.out.println(userDie.getSides());
//        Die myDie = new Die(4);
//        Die sixSide = new Die(6);
//        Die twentySide = new Die(20);
//        System.out.println(myDie.roll());
//        System.out.println(sixSide.roll());
//        System.out.println(twentySide.roll());
    }//end of main method
}//end of die driver class
