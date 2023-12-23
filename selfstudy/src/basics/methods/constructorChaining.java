package basics.methods;

public class constructorChaining {
    private String name;
    private int age;

    public constructorChaining (String name){
        this.name = name;
    }
    public constructorChaining (String name, int age) {
        this(name); // calling single-argument constructor using "this()"
        this.age = age;
    }
    public static void main (String[] args) {
        constructorChaining myObj = new constructorChaining("Elsa", 56);
    }
}
