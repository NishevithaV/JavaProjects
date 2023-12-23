package basics;
import java.util.Scanner;

public class BooleanOperators {
    static Scanner sc = new Scanner(System.in);
    static double salesTax;

    public static void main(String[] args) {
        System.out.print("enter sales Tax price: ");
        salesTax = sc.nextDouble();

        // && operator
        if ((salesTax >=1 ) && (salesTax <=10)){
            double commissionRate = 0.025;
            System.out.println("carried out && statement");
        }
        // " || " operator
        if ((salesTax < 1000) || (salesTax >1)) {
            double commissionRate = 0.0;
            System.out.println("carried out || operator statement");
        }
        String msg = "SalesTax is " +salesTax;
        System.out.println(msg);
    }
}
