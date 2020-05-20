package com.leetcode.solutions.strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1436. Destination City - https://leetcode.com/problems/destination-city/
 *
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.
 * It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
 */
class DestinationCity {
    Set<String> sources = new HashSet<String>();
    Set<String> destinations = new HashSet<String>();

    public String destCity(List<List<String>> paths) {

        for(List<String> sDes : paths){
            sources.add(sDes.get(0));
            destinations.add(sDes.get(1));
        }

        for(String destination : destinations ){
            if(!(sources.contains(destination))){
            return destination;
            }
        }
        return "";
    }
}