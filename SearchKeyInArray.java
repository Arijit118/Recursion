package Recursion;

public class SearchKeyInArray {
    public static void main(String args[]) {
        int num[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        System.out.println(firstOccur(num, 7, 0));
        System.out.println(lastOccur(num, 5, 0));
    }

    public static int firstOccur(int arr[], int key, int i) {
        // base case
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);
    }

    public static int lastOccur(int arr[], int key, int i) {
        // base case
        if (i == arr.length - 1) {
            return -1;
        }
        // check afterward
        int foundKey = lastOccur(arr, key, i + 1);
        if (foundKey != -1) {
            return foundKey;
        }
        // check with self
        if (arr[i] == key) {
            return i;
        }

        return 0;
    }
}
