package com.leetcode.solutions.design;

/**
 * 1603. Design Parking System - https://leetcode.com/problems/design-parking-system
 *
 * Design a parking system for a parking lot.
 * The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.
 */
class ParkingSystem {
    int[] space = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        this.space[0]=big;
        this.space[1]=medium;
        this.space[2]=small;
    }

    public boolean addCar(int carType) {
        if(space[carType-1]!=0){
            space[carType-1] = space[carType-1]-1;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */