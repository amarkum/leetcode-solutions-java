package com.leetcode.solutions.strings;

/**
 * 1678. Goal Parser Interpretation - https://leetcode.com/problems/goal-parser-interpretation/
 *
 * You own a Goal Parser that can interpret a string command.
 * The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
 * The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
 * The interpreted strings are then concatenated in the original order.
 */
public class GoalParser{
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }
}