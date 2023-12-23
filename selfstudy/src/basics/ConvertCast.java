package basics;

public class ConvertCast {
    public static void main(String[] args) {
        String s = "10";
        int x = Integer.parseInt(s); // parsing

        double pi = 3.1314;
        int iPi;
        iPi = (int) pi; // casting
        System.out.println(iPi);
    }
}
