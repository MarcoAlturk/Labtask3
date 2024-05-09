package org.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Charlie", 35);
        map.put("Alice", 30);
        map.put("Bob", 25);

        // Accessing elements
        System.out.println("Age of Bob: " + map.get("Bob"));

        // Iterate through the map in natural order of the keys
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

