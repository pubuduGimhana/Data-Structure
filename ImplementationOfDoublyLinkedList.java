package DataStructure;

//Define the Node class
class Node {
 int data;
 Node prev;
 Node next;

 // Constructor to initialize the node
 Node(int data) {
     this.data = data;
     this.prev = null;
     this.next = null;
 }
}

//Define the DoublyLinkedList class
public class ImplementationOfDoublyLinkedList {
 private Node head;

 // Constructor to initialize the linked list
 public ImplementationOfDoublyLinkedList() {
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
         newNode.prev = current;
     }
 }

 // Method to display the elements of the linked list
 public void display() {
     if (head == null) {
         System.out.println("The list is empty.");
     } else {
         Node current = head;
         while (current != null) {
             System.out.print(current.data + " <-> ");
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

     Node current = head;
     
     // If the node to be removed is the head
     if (current.data == data) {
         head = current.next;
         if (head != null) {
             head.prev = null;
         }
         return;
     }

     while (current != null && current.data != data) {
         current = current.next;
     }

     if (current == null) {
         System.out.println("The value " + data + " is not found in the list.");
         return;
     }

     // If the node to be removed is in the middle or end
     if (current.next != null) {
         current.next.prev = current.prev;
     }
     
     if (current.prev != null) {
         current.prev.next = current.next;
     }
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
     ImplementationOfDoublyLinkedList list = new ImplementationOfDoublyLinkedList();

     // Add elements to the list
     list.add(1);
     list.add(2);
     list.add(3);

     // Display the list
     list.display(); // Output: 1 <-> 2 <-> 3 <-> null

     // Remove an element from the list
     list.remove(2);

     // Display the list again
     list.display(); // Output: 1 <-> 3 <-> null

     // Check if the list contains a certain value
     System.out.println(list.contains(1)); // Output: true
     System.out.println(list.contains(2)); // Output: false
 }
}

