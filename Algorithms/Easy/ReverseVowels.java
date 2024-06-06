package Algorithms.Easy;
/*
Given a string s, reverse only all the vowels in the string and return it.   
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */

class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (start < end) {

            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        String ans = new String(word);
        return ans;
    }

    public static void main(String[] args) {
        try {
            System.out.println(reverseVowels("Leetcode"));
            System.out.println(reverseVowels("solution"));
            System.out.println(reverseVowels("hEllO"));
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
