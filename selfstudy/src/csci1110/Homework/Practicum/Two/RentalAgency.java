package csci1110.Homework.Practicum.Two;

public class RentalAgency {
    private String companyName;
    private int currentFleetSize;
    private Car[] fleet;

    public RentalAgency(String name, int maxSize){
        companyName = name;
        currentFleetSize = 0;
        fleet = new Car[maxSize];
    }

    public boolean addCar(Car car){
        if (currentFleetSize < fleet.length){
            fleet[currentFleetSize] = car;
            currentFleetSize +=1;
            return true;
        }
        return false;
    }
    public boolean removeCar(Car car){
        for (int i=0; i<fleet.length; i++){
            if (fleet[i].equals(car)){
                for (int j = i; j<currentFleetSize-1; j++){
                    fleet[j] = fleet[j+1];
                }
                fleet[currentFleetSize -1] = null;
                currentFleetSize -=1;
                return true;
            }
        }
        return false;
    }
    public RentalAgency deepCopy(){
        // fleet.length or maxSize 
        RentalAgency agencyCopy = new RentalAgency(companyName, fleet.length);

        for (int i=0; i<currentFleetSize; i++){
            agencyCopy.fleet[i] = fleet[i].deepCopy(); // calls deepCopy() method from Car class
            agencyCopy.currentFleetSize++;
        }
        return agencyCopy;
    }

}
