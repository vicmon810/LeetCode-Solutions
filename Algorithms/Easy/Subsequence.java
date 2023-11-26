package Algorithms.Easy;

public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int counter = 0;
        if (s.length() == 0)
            return true;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(counter) == t.charAt(i)) {
                counter++;
            }
            if (counter == s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            System.out.println(isSubsequence("acv", "accvcadadadfdwerewa")); // true
            System.out.println(isSubsequence("abc", "ahbgdc"));// true
            System.out.println(isSubsequence("axc", "ahbgdc")); // false
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
