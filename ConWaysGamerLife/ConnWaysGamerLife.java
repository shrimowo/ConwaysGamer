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
        while (GridGenerating) { //Generates the grid
            for (int x=0;x<GRIDSIZE;x++) {
                for (int y=0;y<GRIDSIZE;y++) {
                    if (Grid[x][y] == 1) System.out.print("o ");
                    else if (Grid[x][y] == 2) System.out.print("x ");
                }
                System.out.println("");
            }
            System.out.println("Give me a 2 positions between 1 & 25 seperated by a comma"); //Instructions
            System.out.println("If you are done type 'done'"); //Instructions
            keyboard = new Scanner(System.in);
            String doneCheck = keyboard.nextLine().toLowerCase();
            if (doneCheck.equals("done")) GridGenerating = false;
                else {
                String[] nums=doneCheck.split(",");
                //add check here to prevent crashes
                int N1 = Integer.parseInt(nums[0])-1;
                int N2 = Integer.parseInt(nums[1])-1;
                Grid[N1][N2] = 2;
                System.out.print('\u000C');
            }
        }
        System.out.print('\u000C');
        System.out.println("How many generations do you want the game to run for?"); //Instructions
        keyboard = new Scanner(System.in);
        final int GENERATIONS = Integer.parseInt(keyboard.nextLine());
        int[][][] GridGen = new int[GENERATIONS+1][GRIDSIZE][GRIDSIZE]; 
        int livecells = 0;
        for (int x=0;x<GRIDSIZE;x++) {
            for (int y=0;y<GRIDSIZE;y++) {
                if (Grid[x][y] == 1) GridGen[0][x][y] = 1 ;
                else if (Grid[x][y] == 2) GridGen[0][x][y] = 2;
            }
        }
        for (int g=0;g<GENERATIONS;g++) {
            System.out.println("Generation "+(g));
            for (int x=0;x<GRIDSIZE;x++) {
                for (int y=0;y<GRIDSIZE;y++) {
                    livecells = 0;
                    if (x==1 && y==1) {
                        if (GridGen[g][x][y+1] == 2) livecells++; //Bottom
                        if (GridGen[g][x+1][y+1] == 2) livecells++; //Bottom Right
                        if (GridGen[g][x+1][y] == 2) livecells++; //Right
                    } else if (x==GRIDSIZE && y==GRIDSIZE) {
                        if (GridGen[g][x][y-1] == 2) livecells++; //Top
                        if (GridGen[g][x-1][y-1] == 2) livecells++; //Top Left
                        if (GridGen[g][x-1][y] == 2) livecells++; //Left
                    } else if (x==GRIDSIZE && y==1) { // fix
                        if (GridGen[g][x][y+1] == 2) livecells++; //Bottom
                        if (GridGen[g][x-1][y+1] == 2) livecells++; //Bottom Left
                        if (GridGen[g][x-1][y] == 2) livecells++; //Left
                    } else if (x==1 && y==GRIDSIZE) { //fix
                        if (GridGen[g][x][y-1] == 2) livecells++; //Top
                        if (GridGen[g][x+1][y-1] == 2) livecells++; //Top Right
                        if (GridGen[g][x+1][y] == 2) livecells++; //Right                        
                    } else if (x==1) {
                        if (GridGen[g][x][y+1] == 2) livecells++; //Bottom
                        if (GridGen[g][x][y-1] == 2) livecells++; //Top
                        if (GridGen[g][x+1][y+1] == 2) livecells++; //Bottom Right
                        if (GridGen[g][x+1][y] == 2) livecells++; //Right
                        if (GridGen[g][x+1][y-1] == 2) livecells++; //Top Right
                    } else if (y==1) {
                        if (GridGen[g][x-1][y+1] == 2) livecells++; //Bottom Left
                        if (GridGen[g][x-1][y] == 2) livecells++; //Left
                        if (GridGen[g][x][y+1] == 2) livecells++; //Bottom
                        if (GridGen[g][x+1][y+1] == 2) livecells++; //Bottom Right
                        if (GridGen[g][x+1][y] == 2) livecells++; //Right 
                    } else if (x==GRIDSIZE) {
                        if (GridGen[g][x][y-1] == 2) livecells++; //Top
                        if (GridGen[g][x][y+1] == 2) livecells++; //Bottom
                        if (GridGen[g][x-1][y-1] == 2) livecells++; //Top Left
                        if (GridGen[g][x-1][y] == 2) livecells++; //Left
                        if (GridGen[g][x-1][y+1] == 2) livecells++; //Bottom Left
                    } else if (y==GRIDSIZE) {
                        if (GridGen[g][x-1][y+1] == 2) livecells++; //Top Right
                        if (GridGen[g][x-1][y] == 2) livecells++; //Right
                        if (GridGen[g][x][y+1] == 2) livecells++; //Top
                        if (GridGen[g][x+1][y+1] == 2) livecells++; //Top Left
                        if (GridGen[g][x+1][y] == 2) livecells++; //Left
                    } else {
                        if (GridGen[g][x-1][y+1] == 2) livecells++; //Bottom Left
                        if (GridGen[g][x-1][y] == 2) livecells++; //Left
                        if (GridGen[g][x-1][y-1] == 2) livecells++; //Top Left
                        if (GridGen[g][x][y+1] == 2) livecells++; //Bottom
                        //if (GridGen[g][x][y] == 2) livecells++; This is the cell being checked
                        if (GridGen[g][x][y-1] == 2) livecells++; //Top
                        if (GridGen[g][x+1][y+1] == 2) livecells++; //Bottom Right
                        if (GridGen[g][x+1][y] == 2) livecells++; //Right
                        if (GridGen[g][x+1][y-1] == 2) livecells++; //Top Right
                    }
                    if (GridGen[g][x][y] == 1) System.out.print("o ");
                    else if (GridGen[g][x][y] == 2) System.out.print("x ");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }

        
    }
}

