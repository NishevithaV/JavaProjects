package csci1110.Assignment.One;
import java.util.Scanner;

public class assignment1Problem1 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double smallestDev = 100.0;
        int smallMonth =0;
        double greatestDev = 0;
        int greatMonth =0;
        double [] pFifty = {3.2, 4.2, 5.1, 5.8, 6.4, 6.9, 7.3, 7.6, 7.9, 8.2, 8.5, 8.7, 8.9};
        for (int month=0; month<=11; month++) {
            double userWeight = sc.nextDouble();
            double devWeight = pFifty[month] - userWeight;
            devWeight = Math.abs(devWeight);
            if (devWeight > greatestDev) {
                greatestDev = devWeight;
                greatMonth =month;
            }
            if (devWeight < smallestDev) {
                smallestDev = devWeight;
                smallMonth = month;
            }
        }
        System.out.println("Month #"+smallMonth+" had the lowest deviation");
        System.out.println("Month #"+greatMonth+" had the highest deviation");
    }
}
