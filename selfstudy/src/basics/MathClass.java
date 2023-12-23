package basics;
import java.util.Scanner;
public class MathClass {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to circle area calculator: ");
        System.out.print("Enter the radius of your circle: ");
        double r = sc.nextDouble();
        double area = Math.PI *(r*r);
        System.out.println("The area is "+area);
        myMathClass();
    }
    public static void myMathClass() {
        System.out.print("enter value a: ");
        int a = sc.nextInt();
        System.out.print("enter value b: ");
        int b = sc.nextInt();
        int greater;
        greater = Math.max(a,b);
        System.out.println("the greater value is "+greater);
    }
}
