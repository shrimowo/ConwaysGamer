
/**
 * Multiple of 5 with a brand spanking new odd/even feature
 *
 * Emmett
 * 30/03/2023
 */
import java.util.Scanner;
public class FMultEven
{
    // instance variables - replace the example below with your own
    private int x;
    Scanner keyboard;

    /**
     * Constructor for objects of class FiveMult
     */
    public FMultEven()
    {
        // initialise instance variables
        System.out.println("Pick an even Multiple of 5!"); //Instructions
        Scanner keyboard = new Scanner(System.in);
        int numbjer=keyboard.nextInt();
        int MultFive=numbjer%5;
        int MultTwo=numbjer%2;
        boolean MultFivebo; 
        boolean MultTwobo;
        if (MultFive==0) {
            MultFivebo=true;
        } else {
            MultFivebo=false;
        }
        if (MultTwo==0) {
            MultTwobo=true;
        } else {
            MultTwobo=false;
        }
        
        if (MultFivebo && MultTwobo) System.out.println("Great Job!");
        else if (!MultFivebo && MultTwobo) System.out.println("Not a multiple of five, however it is even!");
        else if (MultFivebo && !MultTwobo) System.out.println("Is a multiple of five, however it is not even!");
        else System.out.println("Completly wrong D: Is not a multiple of five or even!");


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
