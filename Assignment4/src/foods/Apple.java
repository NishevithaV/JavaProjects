package foods;
import farm.Soil;
// WRITE YOUR CODE HERE
/**
 * Class creates apple objects with specific preferred soil
 * @author Nishevitha Venkatesh
 */
public class Apple extends Fruit{
    public Apple(){
        super("Apple",1250.00,15, 275);
        preferredSoil = Soil.Loam;
    }
}