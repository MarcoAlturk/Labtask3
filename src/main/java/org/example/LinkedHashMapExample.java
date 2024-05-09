package org.example;
import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Accessing elements
        System.out.println("Age of Bob: " + map.get("Bob"));

        // Iterate through the map in insertion order
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
