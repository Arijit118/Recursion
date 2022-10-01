package Recursion;

public class BinaryString {
    public static void main(String args[]) {
        /*
         * print all binary string of size n without consecutive ones.
         * ex. "01010101", "10101010"
         */
        printBinaryString(3, 0, "");
    }

    public static void printBinaryString(int n, int lastChoice, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (lastChoice == 0) {
            printBinaryString(n - 1, 0, str + "0");
            printBinaryString(n - 1, 1, str + "1");
        } else {
            printBinaryString(n - 1, 0, str + "0");
        }
    }
}
