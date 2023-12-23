package basics;

public class ShadowVariables {
    static int x;
    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " +x);
        int x =10;
        System.out.println("x= "+x);
        System.out.println("ShadowVariables.x = " +ShadowVariables.x);
        // ShadowVariables.x calls class variable 'x'
    }
}
