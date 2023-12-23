package basics.methods;
// instance methods hence keyword 'static' isn't used
public class methodOverloading {
    public int add(int one, int two) {
        return one+two;
    }
    public double add(double one, double two) {
        return one+two;
    }
    public String add(String one, String two){
        return one+two;
    }
    public static void main(String[] args) {
        methodOverloading example = new methodOverloading();
        int sumInt = example.add(5,6);
        double sumDouble = example.add(5.6,7.9);
        String sumText = example.add("Hello ","World!");

        System.out.println("Integer sum: "+sumInt);
        System.out.println("Double sum: "+ sumDouble);
        System.out.println("String sum: "+sumText);
    }
}
