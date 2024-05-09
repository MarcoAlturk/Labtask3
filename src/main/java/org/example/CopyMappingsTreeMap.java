package org.example;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeMap;

public class CopyMappingsTreeMap {
    public static void CopyMappingsTreeMapMain() {
        TreeMap<Integer, String> originalMap = new TreeMap<>(new ComparatorOrder());
        originalMap.put(1, "One");
        originalMap.put(2, "Two");
        originalMap.put(3, "Three");
        originalMap.put(2, "Five");
        originalMap.put(4, "Four");
        originalMap.put(1, "FIve");

        // Create the second TreeMap and copy all mappings from the first TreeMap
        TreeMap<Integer, String> copiedMap = new TreeMap<>(originalMap);

        // Displaying the copied TreeMap
        System.out.println("Copied TreeMap: " + copiedMap);
    }

    public static void main(String[] args) {
        CopyMappingsTreeMap.CopyMappingsTreeMapMain();
    }
}

class ComparatorOrder implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}