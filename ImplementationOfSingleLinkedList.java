package DataStructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Define the Node class
class Node {
    int data;
    Node next;

    // Constructor to initialize the node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the SingleLinkedList class
public class ImplementationOfSingleLinkedList {
    private Node head;

    // Constructor to initialize the linked list
    public ImplementationOfSingleLinkedList() {
        this.head = null;
    }

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Method to remove a node by value
    public void remove(int data) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("The value " + data + " is not found in the list.");
            return;
        }

        previous.next = current.next;
    }

    // Method to check if the list contains a certain value
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ImplementationOfSingleLinkedList list = new ImplementationOfSingleLinkedList();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);

        // Display the list
        list.display(); // Output: 1 -> 2 -> 3 -> null

        // Remove an element from the list
        list.remove(2);

        // Display the list again
        list.display(); // Output: 1 -> 3 -> null

        // Check if the list contains a certain value
        System.out.println(list.contains(1)); // Output: true
        System.out.println(list.contains(2)); // Output: false
    }
}
