package foods;
import farm.Soil;
// WRITE YOUR CODE HERE
/**
 * Class represents vegetables with a preferred soil type
 * to grow on.
 * Objects from vegetable class will have their own chosen
 * preferred soil to grow on.
 *
 * @author Nishevitha Venkatesh
 */
public class Vegetable extends Food{
    /**
     * Method used to instantiate the vegetable object
     * @param name name of vegetable
     * @param sellPrice selling price of vegetable
     * @param daysToMature days required for vegetable to fully grow
     * @param requiredArea total area required to grow vegetable
     */
    public Vegetable(String name, double sellPrice, int daysToMature, int requiredArea){
        super(name, sellPrice, daysToMature, requiredArea);
        preferredSoil = Soil.Loam;
    }
    /**
     * Method skips 1 day if vegetable is not grown on preferred soil
     * @param soil the soil on which vegetable is grown
     * @return the percentage of days since vegetable was plotted by
     * days required for vegetable to mature.
     */
    public double grow(Soil soil){
        double percent = 0.0;
        if (soil == preferredSoil){
            percent = grow();
        }
        else{
            if(gCounter % 2 == 1){
                percent = grow();
            }
            gCounter++;
        }
        return percent;
    }
}
