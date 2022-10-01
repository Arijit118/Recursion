package Recursion;

public class PrintXpown {
    public static void main(String args[]) {
        System.out.println(power(2, 10));
        System.out.println(optimizedPower(2, 21));
    }

    // calculate x^n using recursion. Time complexity = O(n).
    public static int power(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;

        return xn;
    }

    // Calculate x^n in optimized way. Time complexity O(logn).
    public static int optimizedPower(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // here call the function two times it will take much time to calculate
        // int halfPowerSquare = optimizedPower(x, n / 2) * optimizedPower(x, n / 2);

        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSquare = halfPower * halfPower; // for more optimization and get TC as O(logn).

        // for odd value of n
        if (n % 2 != 0) {
            halfPowerSquare = x * halfPowerSquare;
        }

        return halfPowerSquare;
    }
}
