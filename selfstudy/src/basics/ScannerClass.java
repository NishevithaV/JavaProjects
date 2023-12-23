package basics;
import java.util.Scanner; // must remember
public class ScannerClass {
    static Scanner sc = new Scanner(System.in); // sc is a variable of Scanner class
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println("You entered "+x+".");
    }
}
