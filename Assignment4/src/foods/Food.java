package foods;
import farm.Soil;

// WRITE YOUR CODE HERE
/**
 * This class represents the general class all specific foods must implement
 * Objects of food class can be seeded or harvested
 *
 * @author Nishevitha Venkatesh
 */
public abstract class Food implements Comparable<Food> {
    protected String name;
    protected double sellPrice;
    protected final int daysToMature;
    protected int daysSincePotted;
    protected int requiredArea;
    protected Soil preferredSoil;

    public int gCounter;

    /** Method used to set values for attributes of Food Class
     * @param name the name of food
     * @param sellPrice the selling price of food
     * @param daysToMature the days taken for food to fully grow
     * @param requiredArea the area required to grow the food
     */

    public Food(String name, double sellPrice, int daysToMature, int requiredArea){
        this.name = name;
        this.sellPrice = sellPrice;
        this.daysToMature = daysToMature;
        this.requiredArea = requiredArea;
        this.daysSincePotted = 0;
        this.gCounter = 0;
    }
    /**
     * Getter for name of food
     * @return the name of the food
     */
    public String getName(){
        return this.name;
    }
    /**
     * Getter for the selling price of food
     * @return the selling price of the food
     */
    public double getSellPrice(){
        return this.sellPrice;
    }
    /**
     * Getter for the preferred soil of food
     * @return the preferred soil for the specific food
     */
    public Soil getPreferredSoil(){
        return preferredSoil;
    }
    /**
     * Getter for total days required for food to fully grow
     * @return days required for food to fully grow
     */
    public int getDaysToMature(){
        return this.daysToMature;
    }
    /**
     * Getter for days since food was plotted in field
     * @return the days since food was plotted in field
     */
    public int getDaysSincePotted(){
        return daysSincePotted;
    }
    /**
     * Getter for total amount of area required to grow food
     * @return the total area required to grow food
     */
    public int getRequiredArea(){
        return this.requiredArea;
    }
    /**
     * Method used to grow specific food such as vegetable and fruit
     * @param soil the soil the food is grown on
     * @return the percent of days since potted by days require to mature
     */
    public abstract double grow(Soil soil);
    /**
     * Method used to calculate percent of days since potted
     * by days required to mature.
     * @return the calculated percent of days since potted by
     * days required to mature.
     */
    public double grow(){
        double percent = 0.0;
        daysSincePotted +=1;

        if (daysSincePotted > daysToMature){
            percent = 1.0;
        }
        else{
            percent = (double) daysSincePotted/ daysToMature;
        }
        return percent;
    }
    /**
     * Method used to order food based on selling price
     * @param food to compare its selling price to current
     * food object.
     * @return difference in selling price of two different
     * food objects.
     */
    public int compareTo(Food food) {
        if (this.sellPrice > food.sellPrice){
            return -1;
        }
        else if (this.sellPrice < food.sellPrice){
            return 1;
        }
        else{
            return 0;
        }
    }
    /**
     * Method used to create formatted string with all details of food.
     * @return the formatted string of food including name, preferred soil of food
     * and days since food was potted and days required for food to mature.
     */
    public String toString(){
        return String.format("%s (%s) - %d/%d days", name, preferredSoil, daysSincePotted, daysToMature);
    }
}
