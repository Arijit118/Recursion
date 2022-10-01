package Recursion;

public class AssignmentQFour {
    public static void main(String args[]) {
        /*
         * We are given a string S, we need to find the
         * count of all contiguous substrings
         * starting and ending with the same character.
         */
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubstr(str, 0, n - 1, n));
    }

    public static int countSubstr(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstr(str, i + 1, j, n - 1) +
                countSubstr(str, i, j - 1, n - 1) -
                countSubstr(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res;
    }
}
