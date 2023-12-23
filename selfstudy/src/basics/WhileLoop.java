package basics;

public class WhileLoop {
    public static void main(String[] args) {
        int number = 2;
        while (true) {
            if (number == 12) {
                break;
            }
            System.out.println(number + " ");
            number += 2; // number = number + 2
        }
        System.out.println();
    }
}
