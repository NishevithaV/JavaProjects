package basics.loopStructure;
import java.util.Scanner;
public class votingMachine {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {

        System.out.println("Welcome to the voting machine");
        System.out.print("Enter the error code: ");
        int err = sc.nextInt();

        String msg;

        switch (err) {
            case 1:
                msg = "voter exceeded one candidate. rejected.";
                break;
            case 2:
                msg = "box checked & write-in. rejected.";
                break;
            case 3:
                msg = "voter filled in every box. rejected.";
                break;
            case 4:
                msg = "voter left entire ballot blank. rejected.";
                break;
            default:
                msg = "voter filled out ballot correctly. ballot discarded anyway.";
                break;
        }
        System.out.println(msg);
    }
}
