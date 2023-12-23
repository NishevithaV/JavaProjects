package basics;

public class Wrapping {
    public static void main(String[] args) {
        int wrap = 10;
        System.out.println(wrap); // wrapping aka boxing
        int prim = wrap;
        System.out.println(prim); // unwrapping aka unboxing
    }
}
