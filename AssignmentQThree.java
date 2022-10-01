package Recursion;

import java.util.*;

public class AssignmentQThree {
    public static void main(String args[]) {
        /*
         * Write a program to find length of the String using recursion.
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findLength(str));
    }

    public static int findLength(String str) {
        // base case
        if (str.length() == 0) {
            return 0;
        }

        return findLength(str.substring(1)) + 1;
    }
}
