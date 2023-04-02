
/**
 * Doing this activity
 *
 * Emmett
 * 23/03/2023
 */
public class Plotter
{
    // instance variables - replace the example below with your own
    Coordinate point;

    /**
     * Constructor for objects of class Plotter
     */
    public Plotter()
    {
        // initialise instance variables
        point = new Coordinate();
        point.x=5;
        point.y=7;
        System.out.println("Coordinate location is: "+point.x+","+point.y);
        point.x=3;
        System.out.println("NEW Coordinate location is: "+point.x+","+point.y);
        
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
        return point.x + point.y;
    }
}
