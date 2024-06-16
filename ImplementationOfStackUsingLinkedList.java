package DataStructure;

//Define the Node class
class Node {
 int data;
 Node next;

 // Constructor to initialize the node
 Node(int data) {
     this.data = data;
     this.next = null;
 }
}

//Define the StackUsingLinkedList class
public class ImplementationOfStackUsingLinkedList {
 private Node top;

 // Constructor to initialize the stack
 public ImplementationOfStackUsingLinkedList() {
     this.top = null;
 }

 // Method to push an element onto the stack
 public void push(int data) {
     Node newNode = new Node(data);
     newNode.next = top;
     top = newNode;
 }

 // Method to pop an element from the stack
 public int pop() {
     if (top == null) {
         System.out.println("Stack is empty.");
         return -1;
     }
     int poppedData = top.data;
     top = top.next;
     return poppedData;
 }

 // Method to peek the top element of the stack
 public int peek() {
     if (top == null) {
         System.out.println("Stack is empty.");
         return -1;
     }
     return top.data;
 }

 // Method to check if the stack is empty
 public boolean isEmpty() {
     return top == null;
 }

 // Method to display the elements of the stack
 public void display() {
     if (top == null) {
         System.out.println("Stack is empty.");
     } else {
         Node current = top;
         while (current != null) {
             System.out.print(current.data + " -> ");
             current = current.next;
         }
         System.out.println("null");
     }
 }

 public static void main(String[] args) {
     ImplementationOfStackUsingLinkedList stack = new ImplementationOfStackUsingLinkedList();

     // Push elements onto the stack
     stack.push(1);
     stack.push(2);
     stack.push(3);

     // Display the stack
     stack.display(); // Output: 3 -> 2 -> 1 -> null

     // Pop an element from the stack
     System.out.println("Popped: " + stack.pop()); // Output: Popped: 3

     // Display the stack again
     stack.display(); // Output: 2 -> 1 -> null

     // Peek the top element of the stack
     System.out.println("Top element: " + stack.peek()); // Output: Top element: 2

     // Check if the stack is empty
     System.out.println("Is stack empty? " + stack.isEmpty()); // Output: Is stack empty? false
 }
}
