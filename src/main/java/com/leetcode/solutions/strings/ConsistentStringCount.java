package com.leetcode.solutions.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * 1684. Count the Number of Consistent Strings - https://leetcode.com/problems/count-the-number-of-consistent-strings/
 *
 * You are given a string allowed consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 *
 * Return the number of consistent strings in the array words.
 */
public class ConsistentStringCount {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        int counter =0;
        for(String word:words){
            boolean flag=true;
            for(int j = 0;j<word.length(); j++){
                if(!set.contains(word.charAt(j))){
                    flag = false;
                }
            }
            if(flag){
                counter++;
            }
        }
        return counter;
    }
}