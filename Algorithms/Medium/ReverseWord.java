package Algorithms.Medium;

/*
 * Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.
 */
public class ReverseWord {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();
        int end = words.length;
        while (end > 0) {
            String current = words[end - 1];
            if (current != " ") {
                System.out.println(current);
                result.append(current);
                if (end > 1)
                    result.append(" ");
                end--;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(reverseWords("the sky is blue"));
            System.out.println(reverseWords("  hello world  "));
            System.out.println(reverseWords("a good   example"));
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
