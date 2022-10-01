package Recursion;

public class NaturalNumSum {
    public static void main(String args[]) {
        // print sum of first n natural numbers.
        System.out.println(sum(10));
    }

    // calculate sum using recursion
    public static int sum(int n) {
        // base condition
        if (n == 1) {
            return 1;
        }
        int snm1 = sum(n - 1);
        int sn = n + snm1;

        return sn;
    }
}
