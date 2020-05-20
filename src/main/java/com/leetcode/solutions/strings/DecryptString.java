package com.leetcode.solutions.strings;

/**
 * 1309. Decrypt String from Alphabet to Integer Mapping - https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 *
 * Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 */
class DecryptString {
    public String freqAlphabets(String s) {
        StringBuilder output = new StringBuilder();
        String[] parts = s.split("(?<=#)");

        for (String part : parts) {
            if (part.contains("#")) {
                output.append(decodeNormalString(part.substring(0, part.length() - 3)));
                output.append((char) (96 + Integer.parseInt(part.substring(part.length() - 3, part.length() - 1))));
            } else {
                output.append(decodeNormalString(part));
            }
        }
        return output.toString();
    }

    public String decodeNormalString(String str) {
        if (str == "") {
            return "";
        }
        StringBuilder decodedString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(str.charAt(i)));
            char ch = (char) (digit + 64 + 32);
            decodedString.append(ch);
        }
        return decodedString.toString();
    }
}