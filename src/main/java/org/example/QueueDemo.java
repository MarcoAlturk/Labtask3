package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    int front, rear, capacity;
    int queue[];

    QueueDemo(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    void enqueue(int data) {
        if (capacity == rear) {
            System.out.println("queue is full");
        } else {
            queue[rear] = data;
            rear++;
        }
    }

    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            for(int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i+1];
            }
            if (rear < capacity) {
                queue[rear] = 0;
            }
            rear--;
        }
    }

    // print the elements
    void print() {
        int i;
        for (i = front; i < rear; i++) {
            System.out.println("The elements are " + queue[i]);
        }
    }
    public static Queue<Integer> sortQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return queue;
        }

        Queue<Integer> sortedQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int current = queue.poll();

            boolean placed = false;
            int size = sortedQueue.size();
            for (int i = 0; i < size; i++) {
                int item = sortedQueue.poll();
                if (!placed && item > current) {
                    sortedQueue.add(current);
                    placed = true;
                }
                sortedQueue.add(item);
            }
            if (!placed) {
                sortedQueue.add(current);
            }
        }

        return sortedQueue;
    }
}
