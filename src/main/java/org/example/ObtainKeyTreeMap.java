package org.example;

import java.util.Set;
import java.util.TreeMap;

public class ObtainKeyTreeMap {
    public static void ObtainKeyTreeMapMain() {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");

        // Obtain all keys from the TreeMap
        Set<Integer> keys = treeMap.keySet();
        System.out.println("Keys in the TreeMap: " + keys);
    }
}
