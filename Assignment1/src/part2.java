import java.util.Arrays;
import java.util.Scanner;

public class part2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        double[] pFifty = {3.2, 4.2, 5.1, 5.8, 6.4, 6.9, 7.3, 7.6, 7.9, 8.2, 8.5, 8.7, 8.9};

        // inputting number of weight measurements
        //System.out.print("How many weights will be added: ");
        int numberMonths = sc.nextInt();
        numberMonths -=1;

        // inputting month of life
       // System.out.print("Enter month of life: ");
        int month = sc.nextInt();

        // declaring array of a particular size and storing input weights in array
        double[] userWeights = new double[numberMonths+1];
        for (int index=0; index<=numberMonths; index++) {
           // System.out.print("Enter weight: ");
            double inputWeight = sc.nextDouble();
            userWeights[index] = inputWeight;
        }
        System.out.println();

        /* sorting array in ascending order */
        Arrays.sort(userWeights);

        /* calculating median */
        double median = 0.0;
        int arrayLength = userWeights.length;
        if ((arrayLength %2) !=0 ) {
            int medianIndex = (arrayLength+1)/2 ;
            median = userWeights[medianIndex-1];
        }else {
            int lowerBound = (arrayLength/2)-1;
            int upperBound = arrayLength/2 ;
            median = (userWeights[upperBound] +userWeights[lowerBound]) /2;
        }
        System.out.println("Median weight: "+median);

        // calculating mean absolute deviation
        double mean = 0.0;
        double deviateVal = pFifty[month];
        double deviation = 0.0;
        double sumDeviation = 0.0;
        int loopendCondition = arrayLength-1;
        for (int index =0 ; index<=loopendCondition ; index++) {

            deviation = (userWeights[index]-deviateVal);
            sumDeviation += deviation ;
        }
        mean = sumDeviation/(numberMonths+1);

        System.out.println("Mean weight deviation from P50: "+mean);
    }
}



