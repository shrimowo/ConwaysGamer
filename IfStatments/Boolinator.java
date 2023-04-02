
/**
 * Learning how to use boolean variables
 *
 * Emmett Ross Petty
 * 28/03/2023
 */
public class Boolinator
{
    // instance variables - replace the example below with your own
    private int x;
    boolean shrimp;
    int numyer;
    int nomyer;


    /**
     * Constructor for objects of class Boolinator
     */
    public Boolinator()
    {
        // initialise instance variables
        
        shrimp = true;
        if (shrimp) {
            System.out.println("Shrimptasitic");
     
        } //the END
        numyer = 55;
        nomyer = 7;
        int leftover=numyer%nomyer;
        System.out.println (leftover);
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
