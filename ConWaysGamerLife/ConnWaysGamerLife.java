import java.util.Scanner; //Keyboard input
public class ConnWaysGamerLife
{
    // instance variables - replace the example below with your own
    int GRIDSIZE = 25;// wanna make this a constant
    Scanner keyboard;
    boolean ConWayActive = true;
    public ConnWaysGamerLife()
    {
        int[][] Grid = new int[GRIDSIZE][GRIDSIZE]; 
        for (int x=0;x<GRIDSIZE;x++) 
        for (int y=0;y<GRIDSIZE;y++) {
                Grid[x][y] = 1;
            }
        
        System.out.println("Give me a 2 positions between 1 & 25 seperated by a comma"); //Instructions
        keyboard = new Scanner(System.in);
        String[] nums=keyboard.split(","); //Split doesnt work )=
        int N1 = Integer.parseInt(nums[0]);
        int N2 = Integer.parseInt(nums[1]);
        System.out.print('\u000C');
        //Type 1 if you are SILLY
    }
}
