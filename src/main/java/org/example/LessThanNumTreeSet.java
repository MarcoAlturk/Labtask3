package org.example;

import java.util.Iterator;
import java.util.TreeSet;

public class LessThanNumTreeSet {
    public static void LessThanNumTreeSetMain(TreeSet<Integer> numbers, int givenNumber) {
        Iterator<Integer> iterator = numbers.iterator();
        System.out.print("Numbers in the TreeSet less than " + givenNumber + ": ");
        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            if (currentNumber < givenNumber) {
                System.out.print(currentNumber + " ");
            } else {
                // Since TreeSet stores elements in sorted order, we can stop early
                break;
            }
        }
    }
}
