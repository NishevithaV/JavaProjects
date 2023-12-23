package csci1110.Homework.Other;

public class starPrint {
    public static void main(String[] args)  {
        squarePrint();
        alternateStars();
    }
    public static void squarePrint () {
        System.out.println("Prints stars in square pattern: ");
        int rows = 6;
        int cols = 6;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void alternateStars() {
        System.out.println("Print stars in alternating pattern: ");
        int rows = 6;
        int cols = 6;
        for (int i=0; i<rows; i++) {
            for (int j=1; j<=cols; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
