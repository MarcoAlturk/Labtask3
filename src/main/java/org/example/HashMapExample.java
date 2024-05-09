package org.example;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Charlie", 25);
        map.put("Bob", 35);

        // Accessing elements
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        // Sort the list using a custom comparator that compares keys
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().length() - o2.getKey().length(); // Sort by keys; change to o1.getValue().compareTo(o2.getValue()) to sort by values
            }
        });

        // Iterate through the sorted list
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class ComparatorString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}