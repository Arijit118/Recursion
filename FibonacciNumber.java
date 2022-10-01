package Recursion;

public class FibonacciNumber {
    public static void main(String args[]) {
        // print Nth fibonacci number
        System.out.println(nthFibonacci(6));
    }

    // calculate fibonacci using recursion
    public static int nthFibonacci(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        int fibonm1 = nthFibonacci(n - 1);
        int fibonm2 = nthFibonacci(n - 2);
        int fibon = fibonm1 + fibonm2;

        return fibon;
    }
}
