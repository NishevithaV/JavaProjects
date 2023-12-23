package basics;

public class Enum {
    public enum CardSuit {HEARTS, SPADE, CLUBS, DIAMONDS}
    public static void main(String[] args) {
        CardSuit suit; // suit is a variable of CardSuit
        suit = CardSuit.HEARTS;
        System.out.println("The suit is "+suit);
    }
}
