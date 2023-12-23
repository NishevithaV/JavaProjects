package csci1110.Assignment.Three;
import java.awt.*;

/**
 * This class represents the cars in the Game.
 * Objects from the Car class controls the
 * current position, colour and size of the cars.
 *
 * @author Nishevitha Venkatesh
 */

public class Car {
    private Point currentPosition;
    private Color bodyColour;
    private int movementSpeed;
    private int xSize;
    private int ySize;
    private boolean moveLeft;

    /**
     * Constructor method used to initialize values of car attributes
     * using parameters provided by user
     * @param currentPosition the current x and y coordinates of Car
     * @param bodyColour the colour of the car
     * @param xSize the size of the car in the horizontal direction
     * @param ySize the size of the car in the vertical direction
     */
    public Car(Point currentPosition, Color bodyColour, int speed, int xSize, int ySize, boolean moveLeft){
        this.currentPosition = currentPosition;
        this.bodyColour = bodyColour;
        movementSpeed = speed;
        this.xSize = xSize;
        this.ySize = ySize;
        this.moveLeft = moveLeft;
    }
    /**
     * Method returns current position of Car of type Point
     * @return Car's current position as Point
     */

    public Point getCurrentPosition(){
        return currentPosition;
    }

    /**
     * Method returns colour of the car of type Color
     * @return Car colour as Color
     */
    public Color getBodyColour(){
        return bodyColour;
    }

    /**
     * Method returns size of car in horizontal direction
     * @return size of car in x-direction as an integer
     */
    public int getXSize(){
        return xSize;
    }
    /**
     * Method returns size of car in vertical direction
     * @return size of car in y-direction as an integer
     */
    public int getYSize(){
        return ySize;
    }
    /**
     * Method returns speed of car
     * @return car speed as an integer
     */
    public int getMovementSpeed(){
        return movementSpeed;
    }
    /**
     * Method returns true if car is moving from right to left
     * @return direction of car in the left direction as boolean
     */
    public boolean isMoveLeft(){
        return moveLeft;
    }
    /**
     * Method changes current position of car depending on
     * whether or not car is moving from right to left
     */
    public void move(){
        if (moveLeft){
            currentPosition.x -=movementSpeed;
        }
        else{
            currentPosition.x += movementSpeed;
        }
    }

    /**
     * Returns the bounds of the car object which can be used to detect collision
     * @return A Rectangle object defining the bounds of the car
     */
    public Rectangle getCollisionBounds(){
        return new Rectangle(currentPosition.x, currentPosition.y,xSize,ySize);
    }
}

