package csci1110.Homework.Other;
import java.util.Scanner;

public class Problem2 {
    static Scanner in = new Scanner(System.in);
    public static void initialize(int size, String[][] player1, String[][] player2) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                player1[i][j] = "-";
                player2[i][j] = "-";
            }
        }
    }

    public static void printBoard(int size, String[][] player1, String[][] player2) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(player1[i][j]);
            }

            System.out.print("\t");

            for (int j = 0; j < size; j++) {
                System.out.print(player2[i][j]);
            }
            System.out.println();
        }
    }

    public static void addBoats(int size, int boat, String[][] player1, int x1, int y1, int space1, int orientation1) {
        if (orientation1 == 0) {
            int count = 0;
            for (int i = 0; y1 + i < size; i++) {
                if (count != (space1) && count < size) {
                    player1[x1][y1 + i] = "B";
                    count=count+1;
                }
            }
        } else if (orientation1 == 1) {
            int count = 0;
            for (int i = 0; x1 + i < size; i++) {
                if (count != (space1) && count < size) {
                    player1[x1 + i][y1] = "B";
                    count=count+1;
                }

            }
        }
    }
    public static void bombState(int size, String[][] player1, int x1, int y1){
        for (int i = x1 - 2; i <= x1 + 2; i++) {
            if (i >= 0 && i <= size) {
                player1[i][y1] = "X";
            }
        }
        for (int j = y1 - 2; j <= y1 + 2; j++) {
            if (j >= 0 && j <= size) {
                player1[x1][j] = "X";
            }
        }
    }

    public static void addShots(String[][] player1, int x1, int y1) {
        if (player1[x1][y1].equals("B")) {
            player1[x1][y1] = "X";
        } else {
            player1[x1][y1] = "X";
        }
    }

    public static String gameState(int size, String[][] player1, String[][] player2) {
        String result ="";
        int count1 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (player1[i][j].equals("B")) {
                    count1=count1+1;
                }
            }
        }
        int count2 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (player2[i][j].equals("B")) {
                    count2=count2+1;
                }
            }
        }

        if (count1 <= 0 && count2 <= 0) {
            result="All Destroyed!";
        } else if (count1 >= 1 && count2 == 0) {
            result="P1 Won!";
        } else if (count1 == 0 && count2 <= 1) {
            result="P2 Won!";
        } else if (count1 >= 0 && count2 >= 0) {
            result="Draw!";
        }

        return result;
    }

    public static void main(String[] args) {

        int x1 = 0, y1 = 0, space1 = 0, orientation1 = 0;
        int x2 = 0, y2 = 0, space2 = 0, orientation2 = 0;

        int size = in.nextInt();
        int boat = in.nextInt();

        String[][] player1 = new String[size][size];
        String[][] player2 = new String[size][size];

        initialize(size, player1, player2);

        for (int i = 0; i < boat; i++) {
            x1 = in.nextInt();
            y1 = in.nextInt();
            space1 = in.nextInt();
            orientation1 = in.nextInt();
            addBoats(size, boat, player1, x1, y1, space1, orientation1);

            x2 = in.nextInt();
            y2 = in.nextInt();
            space2 = in.nextInt();
            orientation2 = in.nextInt();
            addBoats(size, boat, player2, x2, y2, space2, orientation2);
        }
        printBoard(size, player1, player2);

        int shots = in.nextInt();

        for (int i = 0; i < shots; i++) {

            x1 = in.nextInt();
            y1 = in.nextInt();
            addShots(player2, x1, y1);
            if (i==shots-1){
                x1 = in.nextInt();
                y1 = in.nextInt();
                bombState(size,player2, x1, y1);
            }

            x2 = in.nextInt();
            y2 = in.nextInt();
            addShots(player1, x2, y2);
            if (i==shots-1){
                x2 = in.nextInt();
                y2 = in.nextInt();
                bombState(size,player1, x2, y2);
            }

        }
        printBoard(size, player1, player2);
        String s= gameState(size, player1, player2);
        System.out.println();
        System.out.println(s);
    }

}
