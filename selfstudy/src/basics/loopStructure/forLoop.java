package basics.loopStructure;

public class forLoop {
    public static void main(String[] args) {
        System.out.print("We are go for launch in T minus ");
        for (int count = 10; count >=0 ; count--) {
            if (count ==8){
                System.out.println("Ignition sequence starts!");
            }
            else {
                System.out.println(count + "...");
            }
        }
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have a liftoff!");
        methodTwo();
    }
    public static void methodTwo() {
        System.out.print("lAUNCHING IN T MINUS ");
        for (int count = 10; count >=0 ; System.out.println((count ==8)
            ? "Ignition sequence start!" : count + "..."), count--);
        System.out.println("All engines running!");
        System.out.println("LIFTOFF HAPPENING NOW!!");
    }
}
