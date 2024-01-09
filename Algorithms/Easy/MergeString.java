package Algorithms.Easy;

/*
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 */
class MergeString {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        String[] words;
        // int end = words.length;
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length())
                result.append(word1.charAt(i));
            if (i < word2.length())
                result.append(word2.charAt(i));
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(mergeAlternately("hl", "elo"));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}