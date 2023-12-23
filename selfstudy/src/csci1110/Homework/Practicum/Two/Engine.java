package csci1110.Homework.Practicum.Two;

public class Engine {
    private String model;
    private int horsePower;
    public Engine(String model, int horsepower){
        this.model = model;
        this.horsePower = horsePower;
    }

    public int accelerate(){
        return 10;
    }

    // deep copy created
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (!(obj instanceof Engine)){
            return false;
        }
        Engine otherEngine = (Engine) obj;
        return model.equals(otherEngine.model) && horsePower == otherEngine.horsePower;
    }

    // returns all the attributes of the current object of Engine
    public Engine deepCopy(){
        return new Engine(this.model, this.horsePower);
    }

}
