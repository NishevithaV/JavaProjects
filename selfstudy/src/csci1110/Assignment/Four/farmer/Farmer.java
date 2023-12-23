package csci1110.Assignment.Four.farmer;


import farm.Farm;
import foods.Food;
// WRITE YOUR CODE HERE
/**
 * Class creates Farmer objects that own a farm
 * Objects of this class can have a name and a farm
 *
 * @author Nishevitha Venkatesh
 */
public class Farmer{
    private String name;
    private int energy;
    private Farm farm;
    /**
     * Method instantiates farmer's name, energy
     * @param name the name of the farmer
     */
    public Farmer(String name){
        this.name = name;
        this.energy = 100;
        this.farm = null;
    }
    /**
     * Method instantiates farmer's name, energy and farm
     * @param name the name of the farmer
     * @param farm the farm owned by farmer
     */
    public Farmer(String name, Farm farm){
        this.name = name;
        this.energy = 100;
        this.farm = farm;
    }
    /**
     * Method returns specific food from farm
     * @param index the specific food from farm
     * @return the food from farm or null if food
     * does not exist
     */
    public Food getFoodFromFarm(int index){
        if (farm != null){
            return farm.getFood(0);
        }
        return null;
    }
    /**
     * Getter for the name of the farmer
     * @return farmer's name
     */
    public String getName(){
        return name;
    }
    /**
     * Getter for the energy remaining of farmer
     * @return farmer's remaining energy
     */
    public int getEnergy(){
        return energy;
    }
    /**
     * Method increases farmer's energy by 35 and
     * grows all foods on farm by one day if farmer
     * owns a farm.
     */
    public void sleep(){
        energy += 35;
        if (energy >= 100){
            energy = 100;
        }
        if (farm != null){
            farm.overnightGrow();
        }
    }
    /**
     * Method seeds a food on farm if farmer has
     * the energy to seed the food.
     * @param food the food to be seeded on farm
     * @return true if food was seeded & false otherwise
     */
    public boolean seedFood(Food food){
        if (farm != null && energy >= getSeedECost(food) && farm.seedFood(food)){
            energy -= getSeedECost(food);
            return true;
        }
        return false;
    }
    /**
     * Method buys a farm for farmer if farmer does
     * not own a farm.
     * @param newFarm the farm to be bought by farmer
     * @return true if farm was bought & false otherwise
     */
    public boolean buyFarm(Farm newFarm){
        if (farm == null){
            farm = newFarm;
            return true;
        }
        return false;
    }
    /**
     * Method returns energy required to seed specific foods
     * @param food the specific food to be seeded
     * @return the energy required to seed that food
     */
    private int getSeedECost(Food food){
        if (food instanceof foods.Vegetable){
            return 30;
        }
        else if (food instanceof foods.Fruit){
            return 50;
        }
        else{
            return 0;
        }
    }
    /**
     * Method creates a string for farmer containing
     * farm information, foods on farm information and
     * information about farmer.
     * @return the string containing all details about farm
     * and farmer.
     */
    public String toString(){
        StringBuilder s = new StringBuilder();

        s.append("Farmer: ").append(name).append("\n");
        s.append("Energy left: ").append(energy).append("/100\n");

        if (farm != null){
            s.append("Farm info:\n").append(farm.toString());
        }
        else{
            s.append(name).append(" owns no farm");
        }
        return s.toString();
    }
}