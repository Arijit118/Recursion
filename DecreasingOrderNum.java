package Recursion;

public class DecreasingOrderNum {
    public static void main(String args[]) {
        // print number from n to 1.
        int n = 10;

        printNumDec(n);

    }

    // Recursion function
    public static void printNumDec(int n) {
        // Base condition
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printNumDec(n - 1);
    }
}
