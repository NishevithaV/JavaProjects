package csci1110.Homework.Three;

public class SeniorEmployee extends Employee{
    public SeniorEmployee(String name, int regNum){
        super(name,regNum);
    }

    @Override
    public String toString(){
        String s = "Senior Employee: "+super.toString();
        return s;
    }
}
