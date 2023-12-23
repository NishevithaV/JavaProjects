package foods;
import farm.Soil;
// WRITE YOUR CODE HERE
/**
 * Class creates carrot objects with specific preferred soil
 * @author Nishevitha Venkatesh
 */
public class Carrot extends Vegetable{
    public Carrot(){
        super("Carrot", 750.32, 15, 100);
        preferredSoil = Soil.Sand;
    }
}
