/**
 * Multiple of 5 with a brand spanking new odd/even feature
 *
 * Emmett
 * 30/03/2023
 */
import java.util.Scanner;
public class Hewwo
{
    // instance variables - replace the example below with your own
    private int x;
    Scanner keyboard;

    /**
     * Constructor for objects of class FiveMult
     */
    public Hewwo()
    {
        // initialise instance variables
        System.out.println("How many people are coming?"); //Instructions
        Scanner keyboard = new Scanner(System.in);
        int People=keyboard.nextInt();
        if (People == 1) System.out.println("tēnā koe");
        else if (People == 2) System.out.println("tēnā kōrua");
        else if (People > 2) System.out.println("tēnā koutou");
        else System.out.println("-_-");


    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
