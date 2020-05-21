package com.leetcode.solutions.strings;

/**
 * 557. Reverse Words in a String III - https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * <p>
 * Given a string, you need to reverse the order of characters in each word within a sentence,
 * while still preserving whitespace and initial word order.
 */
class ReverseWordsInString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] words = s.split(" ");

        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().append(" "));
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}