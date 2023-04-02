/**
 * Testing scanning Keyboard Inputs (EXTENSION)
 *
 * Emmett Petty
 * 28/03/2023
 */

import java.util.Scanner; //Keyboard input
public class ScannerExtension
{
    // instance variables - replace the example below with your own
    private int x;
    Scanner keyboard;

    /**
     * Constructor for objects of class ScannerDemo
     */
    public ScannerExtension()
    {

       
        System.out.println("Pick a number!"); //Instructions
        Scanner keyboard = new Scanner(System.in);
        int Number1=keyboard.nextInt();
        
        System.out.println("Pick another number!"); //Instructions
        Scanner keyboard2 = new Scanner(System.in);
        int Number2=keyboard.nextInt();
        System.out.println("First number added with the second makes "+(Number1+Number2));
        System.out.println("First number multiplied with the second makes "+(Number1*Number2));
        System.out.println("First number divided with the second makes "+(Number1/Number2));
        System.out.println("Second number subtracted from the first makes "+(Number1-Number2));
        
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
