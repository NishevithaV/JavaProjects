package csci1110.Homework.Three;

public class JuniorEmployee extends Employee{
    public JuniorEmployee(String name, int regNum){
        super(name, regNum);
    }


    @Override
    public String toString(){
        String s = "Junior Employee: "+super.toString();
        return s;
    }

}
