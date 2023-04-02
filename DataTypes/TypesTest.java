
/**
 * Testing out data types
 *
 * Emmett Petty
 * 23/03/2023
 */
public class TypesTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class TypesTest
     */
    public TypesTest()
    {
        // initialise instance variables
        x = 21;
        double JOE=3141592653589793l;
        float rot=2222.2f;
        boolean Cringe=true;
        char numbjer='a';
        numbjer = 'b';
        
        System.out.println("Regular");
        System.out.println(" ");
        System.out.println(JOE);
        System.out.println(rot);
        System.out.println(Cringe);
        System.out.println(numbjer);
        System.out.println(" ");
        System.out.println(" ");
        
        JOE ++;
        rot ++;
        //Cringe ++; Does not work 
        //numbjer ++; Does not work
        
        System.out.println("++; added");
        System.out.println(" ");
        System.out.println(JOE);
        System.out.println(rot);
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
