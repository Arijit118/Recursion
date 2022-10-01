package Recursion;

public class IncreasingOrderNum {
    public static void main(String args[]) {
        // print numbers from 1 to n.
        int n = 10;
        printInc(n);
    }

    public static void printNum(int n) {
        // Base condition
        if (n == 10) {
            System.out.print(10);
            return;
        }

        System.out.print(n + " ");
        printNum(n + 1);
    }
    // another way

    public static void printInc(int n) {
        // base case
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }
}
