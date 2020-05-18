package com.leetcode.solutions.arrays;

/**
 * 1450. Number of Students Doing Homework at a Given Time - https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
 *
 * Return the number of students doing their homework at time queryTime.
 * More formally, return number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
 */
class WorkingAtGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count =0;
        for(int i = 0;  i< startTime.length; i++){
            if( queryTime >= startTime[i] && queryTime <= endTime[i]){
                count++;
            }
        }
        return count;
    }
}