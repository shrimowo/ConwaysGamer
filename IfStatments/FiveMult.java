/**
 * Multiple of 5 check.com
 *
 * emery
 * 28/03/2023
 */
import java.util.Scanner;
public class FiveMult
{
    // instance variables - replace the example below with your own
    private int x;
    Scanner keyboard;

    /**
     * Constructor for objects of class FiveMult
     */
    public FiveMult()
    {
        // initialise instance variables
        System.out.println("Pick an Multiple of 5!"); //Instructions
        Scanner keyboard = new Scanner(System.in);
        int numbjer=keyboard.nextInt();
        int MultFive=numbjer%5;
        int MultTwo=numbjer%2;
        if (MultFive==0) {
            System.out.println(numbjer+"*");
        } else {
            System.out.println(numbjer+" lier");
        }


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
