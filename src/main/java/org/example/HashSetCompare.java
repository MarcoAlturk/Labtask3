package org.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetCompare {
    public static void HashSetCompareMain(Set<Integer> set1, Set<Integer> set2) {
        if (set1.equals(set2)) {
            System.out.println("Both hash sets are equal.");
        } else {
            System.out.println("Both hash sets are not equal.");
            Set<Integer> uniqueToSet1 = new HashSet<>(set1);
            Set<Integer> uniqueToSet2 = new HashSet<>(set2);

            // Remove all elements from set1 that are in set2 (and vice versa) to find unique elements
            uniqueToSet1.removeAll(set2);
            uniqueToSet2.removeAll(set1);

            // Combine both sets of unique elements
            uniqueToSet1.addAll(uniqueToSet2);

            // Display the result
            System.out.println("Elements not common in both hash sets: " + uniqueToSet1);
        }
        Set<Integer> commonElements = new HashSet<>(set1); // Use set1 as the base
        commonElements.retainAll(set2); // Retain only elements that are also in set2

        System.out.println("Elements common in both hash sets: " + commonElements);

    }
}
