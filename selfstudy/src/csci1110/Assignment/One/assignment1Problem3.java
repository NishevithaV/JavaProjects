package csci1110.Assignment.One;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class assignment1Problem3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // System.out.print("Number of inputs: ");
        // N represents the number of inputs
        int N = sc.nextInt();

        // remove new line character from .nextInt()
        sc.nextLine();

        // creating array of 12 rows (months) and 31 columns (days)
        double[][] dataTable = new double[12][31];

        for (int index=0; index<N; index++) {
            // System.out.print("enter month, day and weight: ");
            String userInput = sc.nextLine();
            String[] parts = userInput.split(" ");
            int month =Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);

            // initializing weight
            double weight = 0.0;

            /* if user entered weight, then we store it in the variable 'weight'
            otherwise, the weight remains as 0.0
             */
            if (!parts[2].equals(" ")) {
                weight = Double.parseDouble(parts[2]);
            }
            // storing the weight in the 2D array
            dataTable[month][day-1]= weight;
        }

        // List<List<Double>> nonZeroArray = new ArrayList<>();
        double[] medianArray = new double[12];

        // add non-zero weights to ArrayList and sort each row in array
        for (int row=0; row<12; row++) {
            ArrayList<Double> monthWeight = new ArrayList<>();
            for (int col = 0; col<31; col++) {
                double weight = dataTable[row][col];
                if (weight!=0.0){
                    monthWeight.add(weight);
                }
            }
            Collections.sort(monthWeight);
            int size = monthWeight.size();
            if (size%2 ==1){
                medianArray[row] = monthWeight.get(size/2);
            }
            else{
                double lowerBound = monthWeight.get(size/2-1);
                double upperBound = monthWeight.get(size/2);
                medianArray[row] = (lowerBound+upperBound)/2.0;
            }
        }
        System.out.print("Median weights by month: [");
        for (int row = 0; row<11; row++){
            System.out.print(medianArray[row]+", ");
        }
        System.out.print(medianArray[11]+"]");

    }
}
