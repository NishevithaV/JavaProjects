package farm;
import foods.Food;
// WRITE YOUR CODE HERE
/**
 * Class creates apple farms of Loam soil
 * Objects of this class are farms with Loam soil
 * and can seed food onto the farm
 *
 * @author Nishevitha Venkatesh
 */
public class AppleFarm extends Farm{
    /**
     * Method instantiates area and soil of farm
     * @param totalArea the available area on farm to seed
     */
    public AppleFarm(int totalArea){
        super(totalArea,Soil.Loam);
    }
    /**
     * Method seeds food onto farm if food is apple
     * @param food the food to be seeded onto farm
     * @return true if food was apple and area was available
     * otherwise returns false.
     */
    public boolean seedFood(Food food){
        boolean isSeeded = false;
        if (food.getName().equals("Apple")){
            isSeeded = super.seedFood(food);
        }
        return isSeeded;
    }
}