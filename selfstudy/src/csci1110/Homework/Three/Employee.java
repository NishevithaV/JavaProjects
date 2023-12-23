package csci1110.Homework.Three;

public abstract class Employee {

    private String name;
    private int registryNumber;

    public Employee(String name, int regNum){
        this.name = name;
        this.registryNumber = regNum;
    }

    public String getName(){
        return this.name;
    }

    public int getRegistryNumber(){
        return registryNumber;
    }

    @Override
    public String toString(){
        String s = name+" - "+String.format("%05d",registryNumber);
        return s;
    }

}
