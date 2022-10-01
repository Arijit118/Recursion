package Recursion;

public class PairingProblem {
    public static void main(String args[]) {
        /*
         * Given n friends, each one can remain single or can be paired up with some
         * other friend.
         * Each friend can paired up only once. Find the total number of ways in which
         * friends
         * can remain
         * single or can be paired up.
         */
        System.out.println(pairing(3));
    }

    public static int pairing(int n) { // n = number of friends
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // choice making for single
        int fnm1 = pairing(n - 1);

        // for paired up
        int fnm2 = pairing(n - 2);// because self is 1 rest n-1(pair choice)
        int pairWays = (n - 1) * fnm2;

        int totalWays = fnm1 + pairWays;
        return totalWays;
    }
}
