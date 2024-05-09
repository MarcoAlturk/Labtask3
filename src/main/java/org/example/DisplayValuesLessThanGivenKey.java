package org.example;

import java.util.NavigableMap;
import java.util.TreeMap;

public class DisplayValuesLessThanGivenKey {
    public static void DisplayValuesLessThanGivenKeyMain() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");

        // Define the given key
        int givenKey = 3;

        // Get a view of the portion of this map whose keys are less than the given key
        NavigableMap<Integer, String> subMap = treeMap.headMap(givenKey, false);

        // Display values of the TreeMap whose keys are less than the given key
        System.out.println("Values with keys less than " + givenKey + ": " + subMap.values());
    }
}
