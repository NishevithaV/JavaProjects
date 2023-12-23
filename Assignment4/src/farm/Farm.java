package farm;
import foods.Food;
import java.util.ArrayList;
// WRITE YOUR CODE HERE
/**
 * Class creates a farm with different food types and
 * total available farm area.
 * Objects of this class can grow different foods that each
 * require different area.
 *
 * @author Nishevitha Venkatesh
 */
public class Farm {
    protected int totalArea;
    protected ArrayList<Food> foods;
    protected Soil farmSoil;
    /**
     * Method instantiates area and type of farm on soil
     * @param totalArea total area available to grow food on farm
     * @param farmSoil type of soil on farm
     */
    public Farm(int totalArea, Soil farmSoil){
        this.totalArea = totalArea;
        this.farmSoil = farmSoil;
        this.foods = new ArrayList<>();
    }
    /**
     * Getter for the total area of farm
     * @return the total area of farm
     */
    public int getTotalArea(){
        return this.totalArea;
    }
    /**
     * Getter for type of soil on farm
     * @return the soil type on farm
     */
    public Soil getFarmSoil(){
        return this.farmSoil;
    }
    /**
     * Getter for total amount of foods on farm
     * @return the total foods on farm
     */
    public int getFoodQuantity(){
        return foods.size();
    }
    /**
     * Method returns the food to be found on farm &
     * otherwise returns null.
     * @param index the food to be found on farm
     * @return the food on farm
     */
    public Food getFood(int index){
        if(index>= 0 && index < foods.size()){
            return foods.get(index);
        }
        return null;
    }
    /**
     * Method returns total value of all foods on farm
     * @return the total value of foods on farm
     */
    public double getTotalFarmValue(){
        double sum=0.00;
        for (Food food : foods){
            sum += food.getSellPrice();
        }
        return sum;
    }
    /**
     * Method returns sum of values of all foods ready to
     * be harvested from farm.
     * @return the total value of foods to be harvested
     * from farm.
     */
    public double getReadyToHarvestValue(){
        double sum = 0.00;
        for (Food food: foods){
            if (food.getDaysSincePotted()>= food.getDaysToMature()){
                sum += food.getSellPrice();
            }
        }
        return sum;
    }
    /**
     * Method seeds food on farm if area is available
     * @param food the food to be seeded onto farm
     * @return true if food was seeded and false if not
     */
    public boolean seedFood(Food food){
        if(food.getRequiredArea() <= totalArea){
            totalArea -= food.getRequiredArea();
            foods.add(food);
            return true;
        }
        return false;
    }
    /**
     * Method harvests food from farm if food is fully grown
     * @param index the food to be harvestted from farm
     * @return the removed food or null if it is not yet
     * fully grown.
     */
    public Food harvestFood(int index){
        if (index >= 0 && index< foods.size()){
            Food toHarvest = foods.get(index);
            if (toHarvest.getDaysSincePotted() >= toHarvest.getDaysToMature()){
                totalArea += toHarvest.getRequiredArea();
                return foods.remove(index);
            }
        }
        return null;
    }
    /**
     * Method grows all foods on farm by one day
     */
    public void overnightGrow(){
        for (Food food: foods){
            food.grow(farmSoil);
        }
    }
    /**
     * Method creates a string containing all atrributes of farm
     * @return formatted string of farm value, harvested food values,
     * all foods on farm and days required for each food to fully grow.
     */
    public String toString(){
        String s = "";
        String farmval = String.format("%.2f", getTotalFarmValue());
        String harvestVal = String.format("%.2f", getReadyToHarvestValue());
        s = "Total farm value: "+farmval+"\n";
        s = s+"Ready to harvest value: "+harvestVal+"\n";

        if (foods.isEmpty()){
            s = s+"No food available";
        }
        else{
            s = s+"Food available:\n";
            for (int i=0; i<foods.size();i++){
                s=s+i+" - "+foods.get(i).toString()+"\n";
            }
        }
        return s;
    }
}