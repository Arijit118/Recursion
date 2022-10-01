package Recursion;

public class AssignmentQOne {
    public static void main(String args[]) {
        /*
         * For a given integer array of size N. You have to find all the
         * occurrences(indices)
         * of a given element(Key) and print them. Use a recursive function to solve
         * this problem.
         */
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;
        allOccurance(arr, key, 0);
        System.out.println();
    }

    public static void allOccurance(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return;
        }

        // kaam or job
        if (arr[i] == key) {
            System.out.println(i + " ");
        }
        allOccurance(arr, key, i + 1);
    }
}
