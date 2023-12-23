package csci1110.Assignment.Four.foods;

import csci1110.Assignment.Four.farm.Soil;
// WRITE YOUR CODE HERE
/**
 * Class creates cabbage objects with specific preferred soil
 * @author Nishevitha Venkatesh
 */
public class Cabbage extends Vegetable{
    public Cabbage(){
        super("Cabbage", 239.75, 10, 50);
        preferredSoil = Soil.Clay;
    }
}
