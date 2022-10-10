package CTDLGTBUOI4;

public class Q50 {
    public static double myPow (double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        else  {
            return Math.pow(x, n);
        } 
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
