package basics.loopStructure;
import java.util.Scanner;

public class methodWithAllLoopStructures {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ifLoop("Anna");
        System.out.println(switchLoop(4));
        forLoop();
        whileLoop();
    }
    public static void ifLoop(String name) {
        System.out.println("hi "+name+ "!");
    }
    public static String switchLoop(int num) {
        String val = null;
        switch(num) {
            case 1:
                val = "Monday";
                break;
            case 2:
                val = "Tuesday";
                break;
            default:
                val = "Weekend";
        }
        return val;
    }
    public static void forLoop() {
        for(int x=0; x<3; x++) {
            System.out.println("VALUE OF X: "+x);
        }
    }
    public static void whileLoop() {
        String[] cars = {"","",""};
        int num = 0;
        while (num<3) {
            System.out.print("Enter car name: ");
            String name = sc.next();
            cars[num] = name;
            num++;
        }
        System.out.println();
        for (String i: cars) {
            System.out.print(i+" ");
        }
    }
}
