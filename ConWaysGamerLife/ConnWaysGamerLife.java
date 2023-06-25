import java.util.Scanner; //Keyboard input
public class ConnWaysGamerLife
{
    // instance variables - replace the example below with your own
    final int GRIDSIZE = 25;
    Scanner keyboard;
    boolean StartScreen = true;
    boolean GridGenerating = true;
    public ConnWaysGamerLife()
    {
        int[][] Grid = new int[GRIDSIZE][GRIDSIZE]; 
        System.out.print('\u000C');
        for (int x=0;x<GRIDSIZE;x++) //Sets the grid as off by default
        for (int y=0;y<GRIDSIZE;y++) {
                Grid[x][y] = 1;
        }
        System.out.println("Welcome To Conways Game Of Life"); //Instructions
        System.out.println("Type 'guide' To Be Given Instructions");
        while (StartScreen) {
            System.out.println("Type 'start' To Begin The Game");
            keyboard = new Scanner(System.in);
            String answer=keyboard.nextLine();
            answer = answer.toLowerCase();
            System.out.println(answer);
            if (answer.equals("start")) StartScreen = false;
            else if (answer.equals("guide")) {
                System.out.println("I'll do this l8ter");
            }
            else System.out.println("Sorry your input was invalid");
        }
        System.out.print('\u000C');
        while (GridGenerating) {
            for (int x=0;x<GRIDSIZE;x++) {
                for (int y=0;y<GRIDSIZE;y++) {
                    if (Grid[x][y] == 1) System.out.print("o ");
                    else if (Grid[x][y] == 2) System.out.print("x ");
                }
                System.out.println("");
            }
            System.out.println("Give me a 2 positions between 1 & 25 seperated by a comma"); //Instructions
            //System.out.println("If you are done type 'done'"); //Instructions
            keyboard = new Scanner(System.in);
            String doneCheck = keyboard.nextLine().toLowerCase();
            if (doneCheck.equals("done")) GridGenerating = false;
                else {
                String[] nums=keyboard.nextLine().split(",");
                int N1 = Integer.parseInt(nums[0])-1;
                int N2 = Integer.parseInt(nums[1])-1;
                Grid[N1][N2] = 2;
                System.out.print('\u000C');
            }
        }
        System.out.print('\u000C');
        System.out.println("How many generations do you want the game to run for?"); //Instructions
        keyboard = new Scanner(System.in);
        int generations = Integer.parseInt(keyboard.nextLine());
    }
}

