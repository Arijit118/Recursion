package Recursion;

public class Factorial {
    public static void main(String args[]) {
        // print factorial of a number using recursion.
        System.out.println(calFactorial(5));
    }

    // Calculate factorial of a number using recursion
    public static int calFactorial(int n) {
        // base condition
        if (n == 0) {
            return 1;
        }
        int factnm1 = calFactorial(n - 1);// factnm1 = factorial n minus 1
        int fact = n * factnm1;

        return fact;
    }
}
// Time complexity & space complexity for this problem is O(n).