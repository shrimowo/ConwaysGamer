
/**
 * Testing scanning Keyboard Inputs
 *
 * Emmett Petty
 * 28/03/2023
 */

import java.util.Scanner; //Keyboard input
public class ScannerDemo
{
    // instance variables - replace the example below with your own
    private int x;
    Scanner keyboard;

    /**
     * Constructor for objects of class ScannerDemo
     */
    public ScannerDemo()
    {
        /**
        System.out.println("Write Somthing!"); //Instructions
        Scanner keyboard = new Scanner(System.in);
        int number=keyboard.nextInt();
        System.out.println(number);
        */
       
        System.out.println("How many hours a day do you work?"); //Instructions
        Scanner keyboard = new Scanner(System.in);
        int hours=keyboard.nextInt();
        System.out.println("You work "+hours+" hours a week!");
        
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
