package com.leetcode.solutions.strings;

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