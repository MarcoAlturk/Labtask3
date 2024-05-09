package org.example;

import java.util.TreeMap;

public class LeastAndGreatestKeyTreeMap {
    public static void LeastAndGreatestKeyTreeMapMain() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(3, "Three");
        treeMap.put(10000, "Three");
        treeMap.put(-10, "Three");

        // Find the greatest and least key
        Integer greatestKey = treeMap.lastKey();
        Integer leastKey = treeMap.firstKey();

        System.out.println("Greatest Key: " + greatestKey);
        System.out.println("Least Key: " + leastKey);
    }

    public static void main(String[] args) {
        LeastAndGreatestKeyTreeMap.LeastAndGreatestKeyTreeMapMain();
    }
}
