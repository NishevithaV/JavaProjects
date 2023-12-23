package basics.methods;

public class recursionMethods {
    public static void main(String[] args){
        int result = sum(5);
        System.out.println("result: "+result);
    }
    public static int sum(int num){
        if (num>0) {
            return num+sum(num-1);
        }
        else {
           return 0;
        }
    }
}
