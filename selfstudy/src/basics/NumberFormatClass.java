package basics;
import java.text.NumberFormat;
public class NumberFormatClass {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        printMyAllowance();
        printCostOfPaintBallGun();
    }
    public static void printMyAllowance() {
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance "+cf.format(myAllowance));
    }
    public static void printCostOfPaintBallGun() {
        double costOfPaintBallGun = 69.95;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("Cost of paint ball gun: "+cf.format(costOfPaintBallGun));
    }
}
