
package org.example;
public class MyLinkedList {
    private Node head;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void insertAnywhere(int data, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Position: " + position + ", Size: " + size);
        }
        if (position == 0) {
            insertAtFirst(data);
            return;
        } else if (position == size) {
            insertAtLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void deleteFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        if (size == 1) {
            head = null;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void deleteAnywhere(int position) {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot delete from an empty list");
        }
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Position: " + position + ", Size: " + size);
        }
        if (position == 0) {
            deleteFirst();
            return;
        }
        Node current = head;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }

    public boolean searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String viewLL() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        sb.append("[");
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }


}
