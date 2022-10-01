package Recursion;

public class TowerOfHanoi {
    public static void main(String args[]) {
        /*
         * Solving Tower of Hanoi using Recursion.
         */
        int n = 3;
        towerOfHanoi(n, "A", "B", "C");
    }

    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        // base case
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + source + " to " + destination);
            return;
        }

        // Transfer n-1 disks from source to helper using destination as helper
        towerOfHanoi(n - 1, source, destination, helper);

        // Transfer nth disk from source to destination
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);

        // Transfer n-1 disk from helper to destination using source as helper
        towerOfHanoi(n - 1, helper, source, destination);
    }
}
