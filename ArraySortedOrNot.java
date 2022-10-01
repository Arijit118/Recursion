package Recursion;

public class ArraySortedOrNot {
    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 8, 6, 9 };
        System.out.println(isSorted(num, 0));
    }

    // function to check given array is sorted or not
    public static boolean isSorted(int arr[], int i) { // i is the starting point.
        // base case
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }
}
