
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * This class represents the functioning of the game
 * The class aggregates the Car and Frog class as needed
 * for each method.
 * Objects of this class control the Frog and Car objects
 * that are aggregated.
 *
 * @author Nishevitha Venkatesh
 */

public class Game {

    private Frog player;
    private ArrayList<Car> cars;
    /**
     * Constructor method creates a new player and an ArrayList
     * of cars.
     * 4 cars are added to the ArrayList.
     * @param name the name of the Frog used to instantiate.
     * @param startPos the start position of the Frog
     * used to instantiate.
     */
    public Game(String name, Point startPos){
        player = new Frog(name, startPos);
        cars = new ArrayList<Car>();


        cars.add(new Car(new Point(100,400), Color.BLACK,10,120,75,false));
        cars.add(new Car(new Point(0,300), Color.BLUE, 30,200,75,false));
        cars.add(new Car(new Point(100,150), Color.BLACK, 10,120,75, true));
        cars.add(new Car(new Point(0,80), Color.BLACK, 20, 120, 75, true));
    }
    /**
     * Method returns Frog player
     * @return player as Frog
     */
    public Frog getPlayer(){
        return player;
    }
    /**
     * Method returns ArrayList named cars
     * @return ArrayList of cars as Car
     */
    public ArrayList<Car> getCars(){
        return cars;
    }
    /**
     * Method moves the playeer of type Frog in the horizontal
     * x or vertical direction y based on keyboard input.
     * @param keyEvent an integer keyboard press to determine
     * whether to move in the x or y direction.
     * @param step integer representing number of units to move
     * in x or y direction.
     */
    public void movePlayer(int keyEvent, int step){
        Point currentPosition = player.getCurrentPosition();
        int dx = 0;
        int dy = 0;

        if (keyEvent == KeyEvent.VK_UP){
            dy -=step;
        }
        if (keyEvent == KeyEvent.VK_DOWN){
            dy += step;
        }
        if (keyEvent == KeyEvent.VK_LEFT){
            dx -= step;
        }
        if (keyEvent == KeyEvent.VK_RIGHT){
            dx += step;
        }

        player.move(dx,dy);
    }
    /**
     * Method prevents car from going past edges of game board.
     * @param edge integer representing boundary of game board.
     */
    public void moveCars(int edge){
        for (Car car: cars){

            car.move();

            if(car.isMoveLeft() && car.getCurrentPosition().x <=0 ){
                car.getCurrentPosition().x = edge;
            }

            else if(!car.isMoveLeft() && car.getCurrentPosition().x > edge){
                car.getCurrentPosition().x = 0;
            }
        }
    }
    /**
     * Method determines whether player of type Frog collided
     * with a car on the game board.
     * @return boolean true if hit and false if not hit.
     */
    public boolean isPlayerHit(){
        Rectangle frogBound = player.getCollisionBounds();

        for (Car car: cars){
            Rectangle carBound = car.getCollisionBounds();

            if (frogBound.intersects(carBound)){
                return true;
            }
        }
        return false;
    }
    /**
     * Method determines whether player of type Frog won game.
     * @return boolean if player won and false if lost.
     */
    public boolean hasPlayerWon(){
        if (player.getCurrentPosition().y <=20){
            return true;
        }
        else{
            return false;
        }
    }

}
