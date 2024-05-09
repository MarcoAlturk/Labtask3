package org.example;

class StackExample {
    private int[] arr;   // Array to store stack elements
    private int top;     // Top element index
    private int capacity; // Maximum capacity of the stack

    // Constructor to initialize the stack
    public StackExample(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add an element to the top of the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        arr[++top] = element;
    }

    // Remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top--];
    }

    // Return the top element of the stack
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return -1; // This line will never execute
    }

    // Return the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
}
