package foods;
import farm.Soil;
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