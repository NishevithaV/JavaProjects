
import java.awt.*;

/**
 * This class represents the frog that is operated by the player
 * Objects from the frog class controls the name and position
 * of the frog in the game.
 *
 * @author Nishevitha Venkatesh
 */

public class Frog {

    private String name;
    private Point currentPosition;
    /**
     * Constructor method used to initialize name and current position
     * of frog in the game of type Point
     * @param name is the name of the player (frog)
     * @param currentPos is the current position of the frog of type Point
     */

    public Frog(String name, Point currentPos) {
        this.name = name;
        currentPosition = currentPos;
    }
    /**
     * Constructor method used to initialize name of frog when no position is given
     * overloads the main constructor
     * @param name is the name of the frog
     */

    public Frog(String name) {
        this(name, new Point(0,0));
    }
    /**
     * Method returns the current position of the frog
     * @return current position of the player (frog) as Point
     */

    public Point getCurrentPosition() {
        return currentPosition;
    }
    /**
     * Method returns name of the frog
     * @return name of the frog as String
     */

    public String getName() {
        return name;
    }
    /**
     * Method translates the current position of the player by dx in
     * the horizontal direction and by dy in the vertical direction
     * @param dx is the number of units to move in x direction
     * @param dy is the number of units to move in y direction
     * @return the changed position of player as Point
     */

    public Point move(int dx, int dy){
        currentPosition.translate(dx,dy);
        return currentPosition;
    }
    /**
     * Method calculates distance of a point from the frog
     * @param pointTwo is the other point from which the frog's distance
     * is to be calculated from.
     * @return the distance between the two points as double
     */

    public double distanceFromPoint(Point pointTwo){
        double distance = currentPosition.distance(pointTwo);
        return distance;
    }

    /**
     * Returns the bounds of the car object which can be used to detect collision
     * @return A Rectangle object defining the bounds of the frog
     */

    public Rectangle getCollisionBounds(){
        return new Rectangle(currentPosition.x,currentPosition.y,30,30);
    }

    /**
     * Method prints the name and current position of Frog object
     * @return the name and current position of frog as String
     */

    @Override
    public String toString() {
        return "The frog named " + name + " is at ("+currentPosition.x+","+currentPosition.y+")";
    }
}
