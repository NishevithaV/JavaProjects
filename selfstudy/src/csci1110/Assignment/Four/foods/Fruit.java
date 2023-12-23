package csci1110.Assignment.Four.foods;

import csci1110.Assignment.Four.farm.Soil;

// WRITE YOUR CODE HERE
/**
 * Class represents fruits with a preferred soil type
 * to grow on.
 * Objects from fruit class will have their own chosen
 * preferred soil to grow on.
 *
 * @author Nishevitha Venkatesh
 */
public class Fruit extends Food{
    /**
     * Method used to instantiate the fruit object
     * @param name name of fruit
     * @param sellPrice selling price of fruit
     * @param getDaysToMature days required for fruit to fully grow
     * @param requiredArea total area required to grow fruit
     */
    public Fruit(String name, double sellPrice, int daysToMature, int requiredArea){
        super(name, sellPrice, daysToMature, requiredArea);
        preferredSoil = Soil.Silt;
    }
    /**
     * Method skips 2 days if fruit is not grown on preferred soil
     * @param soil the soil on which fruit is grown
     * @return the percentage of days since fruit was plotted by
     * days required for fruit to mature.
     */
    public double grow(Soil soil){
        double percent = 0.0;
        if (soil == preferredSoil){
            percent = grow();
        }
        else{
            if(gCounter % 3 == 2){
                percent = grow();
            }
            gCounter++;
        }
        return percent;
    }
}
