import java.util.Scanner; //Keyboard input
public class ConnWaysGamerLife
{
    // instance variables - replace the example below with your own
    int GRIDSIZE = 25;// wanna make this a constant
    Scanner keyboard;
    boolean StartScreen = true;
    boolean GridGenerating = true;
    public ConnWaysGamerLife()
    {
        int[][] Grid = new int[GRIDSIZE][GRIDSIZE]; 
        for (int x=0;x<GRIDSIZE;x++) //Sets the grid as off by default
        for (int y=0;y<GRIDSIZE;y++) {
                Grid[x][y] = 1;
        }
        while (StartScreen) {
            System.out.println("Welcome To Conways Game Of Life"); //Instructions
            System.out.println("Type 'start' To Begin The Game");
            System.out.println("Type 'guide' To Be Given Instructions");
            keyboard = new Scanner(System.in);
            String answer=keyboard.nextLine();
            if (answer
        }
        for (int x=0;x<GRIDSIZE;x++) {
            for (int y=0;y<GRIDSIZE;y++) {
                if (Grid[x][y] == 1) System.out.print("o ");
                else if (Grid[x][y] == 2) System.out.print("x ");
            }
            System.out.println("");
                    }
        System.out.println("Give me a 2 positions between 1 & 25 seperated by a comma"); //Instructions
        keyboard = new Scanner(System.in);
        String[] nums=keyboard.nextLine().split(",");
        int N1 = Integer.parseInt(nums[0]);
        int N2 = Integer.parseInt(nums[1]);
        Grid[N1][N2] = 2;
        System.out.print('\u000C');
        System.out.println("Grid done");
        GridGenerating = false;
                }
        }

