package basics.methods;
/* conventional way of writing java code is to
separate abstractBasic & main in one file and separate the
 classes into their own file
  Otherwise the keyword static needs to be used for
  inner loops */

public class abstractBasic {
    public static void main(String[] args) {
        /* create obj of Student class(which inherits attributes
        and methods from FirstClass
         */
        Student stud = new Student();
        System.out.println("Name: " + stud.fname);
        System.out.println("Year: "+ stud.graduationYear);
        stud.study();
    }
    // abstract class
        static abstract class FirstClass {
            public String fname = "John";
            public abstract void study(); // abstract method
    }
    // Subclass (inherit from FirstClass)
        static class Student extends FirstClass {
            public int graduationYear = 2018;
            public void study() {
                /* the body of the abstract method
                is provided here
                 */
                System.out.println("Studying all day long");
            }
    }
}
