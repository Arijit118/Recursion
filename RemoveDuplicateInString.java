package Recursion;

public class RemoveDuplicateInString {
    public static void main(String args[]) {
        String str = "appnnaacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }

    // Remove duplicate char from the string
    public static void removeDuplicate(String str, int idx, StringBuilder newString, boolean map[]) {
        // str = string which i give for remove the dupicate char
        // idx = index number
        // newString = which i got after remove the duplicates char
        // map = array of alphabets from a to z for track it previously came or not

        // base case
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        // job
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a'] == true) {
            // remove duplicate
            removeDuplicate(str, idx + 1, newString, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newString.append(currentChar), map);
        }
    }
}
