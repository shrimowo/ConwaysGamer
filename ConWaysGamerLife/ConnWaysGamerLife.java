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
        while (ConWayActive) {
        System.out.println("Give me a position between 1 & 25"); //Instructions
        keyboard = new Scanner(System.in);
        int N1=(keyboard.nextInt())-1;
        System.out.println("Give me a position between 1 & 25"); //Instructions    
        keyboard = new Scanner(System.in);
        int N2=(keyboard.nextInt())-1;
        if (Grid[N1][N2] == 4) Grid[N1][N2] = 3;
        else Grid[N1][N2] = 2;
        System.out.print('\u000C');
        }
    }
}
