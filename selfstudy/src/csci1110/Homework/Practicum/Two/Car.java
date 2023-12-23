package csci1110.Homework.Practicum.Two;

public class Car {
    private Engine engine;
    private String licensePlate;
    private String make;
    private String model;
    private int currentSpeed;

    // make deep copy of engine
    public Car(Engine engine, String licensePlate, String make, String model, int currentSpeed){
        this.engine = engine;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public Engine getEngine(){
        return engine;
    }
    public void changeEngine(Engine newEngine){
        engine = newEngine;
    }

    public void accelerate(){
        int speedIncrease = engine.accelerate();
        currentSpeed += speedIncrease;
    }

    public void reduceSpeed(){
        if (currentSpeed >=2){
            currentSpeed -=2;
        }
        else{
            currentSpeed = 0;
        }
    }

    public boolean equals(Car car){
        return licensePlate.equals(car.licensePlate) && engine.equals(car.engine);
    }

    public Car deepCopy(){
        return new Car(engine.deepCopy(), licensePlate, make, model, currentSpeed);
    }
}

