package org.example;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void PriorityQueueExampleMain(PriorityQueue<Integer> originalQueue) {
        PriorityQueue<Integer> divisibleQueue = new PriorityQueue<>();

        // Process the original PriorityQueue to find divisible elements
        for (Integer number : originalQueue) {
            if (number % 3 == 0 && number % 5 == 0) {
                divisibleQueue.add(number);
            }
        }

        // Display the contents of both PriorityQueues
        System.out.println("Original PriorityQueue: " + originalQueue);
        System.out.println("PriorityQueue with elements divisible by both 3 and 5: " + divisibleQueue);
    }
}
