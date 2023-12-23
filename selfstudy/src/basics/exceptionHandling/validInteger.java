package basics.exceptionHandling;
import java.util.*; // to also import InputMismatchException class & Scanner class 
public class validInteger {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int i= GetInteger();
        System.out.println("You entered "+i);
    }
    public static int GetInteger() {
        while (true){
            try {
                return sc.nextInt();
            }
            catch (InputMismatchException e){
                sc.nextInt();
                System.out.print("That's not an integer. "+"Try again: ");
            }
        }
    }
}
