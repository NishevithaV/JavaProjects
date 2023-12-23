
/**
 * this program places boats on boards, fires
 shots and outputs winner
 * @author Nishevitha Venkatesh
 */
import java.util.Scanner;

public class Problem1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int boardSize = in.nextInt();
        int boatsToAdd = in.nextInt();
        String[][] playerOne = new String[boardSize][boardSize];
        String[][] playerTwo = new String[boardSize][boardSize];

        // initializing board with "-"
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                playerOne[i][j] = "-";
                playerTwo[i][j] = "-";
            }
        }
        // adding boats to board one player after another
        for (int i = 0; i < boatsToAdd; i++) {
            // player 1
            int xCoord = in.nextInt();
            int yCoord = in.nextInt();
            int boatSize = in.nextInt();
            int orientation = in.nextInt();
            FitBoard(playerOne, xCoord, yCoord, boatSize, orientation);

            // player 2
            xCoord = in.nextInt();
            yCoord = in.nextInt();
            boatSize = in.nextInt();
            orientation = in.nextInt();
            FitBoard(playerTwo, xCoord, yCoord, boatSize, orientation);
        }
        PrintArray(playerOne, playerTwo);
        int shots = in.nextInt();
        FireShot(shots, playerOne, playerTwo);

        PrintArray(playerOne, playerTwo);

        int won = whoWon(playerOne, playerTwo);
        /* determines winner based on
        return value from 'whoWon' function */

        if (won == 0) {
            System.out.println("Draw!");
        }
        else if (won == 1){
            System.out.println("P1 Won!");
        }
        else if (won ==2){
            System.out.println("P2 Won!");
        }
        else{
            System.out.println("All destroyed");
        }
    }
    /**
     * Method used to place boats on board. It will shrink
     * boats to fit size even if boat sizes exceed array size.
     * @param array the player's array on which we place the boards
     * @param xcoord the x coordinate of the boat we place on array
     * @param ycoord the y coordinate of the boat we place on array
     * @param size the length of the array
     * @param orientation determines if boat grows horizontally(orientation=0)
     * or vertically (orientation=1)
     */
    public static void FitBoard(String[][] array, int xcoord, int ycoord, int size, int orientation) {
        int sizeCount = 0;
        if (orientation == 0) {
            for (int i = 0; i < size; i++) {
                array[xcoord][ycoord] = "B";
                sizeCount =sizeCount+1;
                ycoord = ycoord+1;
                if (ycoord >(array.length-1)) {
                    return;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                array[xcoord][ycoord] = "B";
                sizeCount = sizeCount+1;
                xcoord = xcoord+1;
                if (xcoord >(array.length-1)) {
                    return;
                }
            }
        }
    }
    /**
     * Method prints both players' array with both rows of each players' boards
     * on same line separated by a tab character
     * @param array1 player 1's board
     * @param array2 player 2's board
     */
    public static void PrintArray(String[][] array1, String[][] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j]);
            }
            System.out.print("\t");
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    /**
     * Method used to place player 1's shots on player 2's board and vice versa
     * @param numberOfShots the number of fire shots each player places on the other
     * player's board
     * @param array1 player 1's board
     * @param array2 player 2's board
     */
    public static void FireShot(int numberOfShots, String[][] array1, String[][] array2) {
        for (int i = 0; i < numberOfShots; i++) {
            int xShot = in.nextInt();
            int yShot = in.nextInt();
            if (xShot < array2.length && yShot < array2.length) {
                array2[xShot][yShot] = "X";
            }
            xShot = in.nextInt();
            yShot = in.nextInt();
            if (xShot < array1.length && yShot < array1.length) {
                array1[xShot][yShot] = "X";
            }
        }
    }
    /**
     * Method determines who the winner is based on the number of boats
     * left on each player's board and comparing them with each other
     * @param array1 player 1's board
     * @param array2 player 2's board
     * @return 0 if the game was a draw, 1 if player 1 won , 2 if player two won
     * and 4 if all boats were destroyed on both players' boards
     */
    public static int whoWon(String[][] array1, String[][] array2){
        int won = 0; // write code to compare won value in main method to output message
        int p1BoatCount = 0;
        int p2BoatCount = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j =0; j<array1.length; j++) {
                if (array1[i][j].equals("B")){
                    p1BoatCount +=1;
                }
                if (array2[i][j].equals("B")){
                    p2BoatCount +=1;
                }
            }
        }
        if (p1BoatCount>0 && p2BoatCount == 0) {
            won = 1;
        }
        else if (p1BoatCount == 0 && p2BoatCount>0) {
            won = 2;
        }
        else if (p1BoatCount == 0 && p2BoatCount ==0) {
            won = 4;
        }
        return won;
    }
}
