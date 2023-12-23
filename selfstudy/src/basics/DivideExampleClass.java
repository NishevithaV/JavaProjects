package basics;
import java.util.Scanner;
public class DivideExampleClass {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // declarations
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;

        // get input data
        System.out.println("Welcome to marble divvy-upper.");
        System.out.print("Number of Marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();

        // calculate results
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;

        // print results
        System.out.println("Give each child "+marblesPerChild+" marbles.");
        System.out.println("You will have "+marblesLeftOver+" marbles left over");
    }
}
