package org.example;

public class TestStack {
    int size;
    int arr[];
    int top;

    public TestStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1; // adding an elemen gives zero that is the first index of the array
    }
    public void push(int pushedElement) {
        if (!isFull()) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element is " + pushedElement);
        } else {
            System.out.println("Stack is full, you cant add at the moment");
        }
    }
    public int pop() {
        if (!isEmpty()) {
            int returnedElement = top;
            top--;
            System.out.println("Removed element " + arr[returnedElement]);
        } else {
            System.out.println("Stack is empty");
        }
        return -1;
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Stack elements are ");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }else {
            System.out.println("It is void");
        }
    }

    public int peek() {
        if (!isEmpty()) {

            return arr[top];
        } else {
            System.out.println("it is void");
        }
        return -1;
    }
}