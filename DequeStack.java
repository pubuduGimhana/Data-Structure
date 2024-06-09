package DataStructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeStack {
    private Deque<String> deque;

    public DequeStack() {
        deque = new LinkedList<>();
    }

    public void push(String element) {
        deque.addFirst(element);
        System.out.println("Pushed: " + element);
    }

    public void pop() {
        if (!deque.isEmpty()) {
            String element = deque.removeFirst();
            System.out.println("Popped: " + element);
        } else {
            System.out.println("DequeStack is empty, cannot pop.");
        }
    }

    public void enqueue(String element) {
        deque.addLast(element);
        System.out.println("Enqueued: " + element);
    }

    public void display() {
        System.out.println("Current DequeStack: " + deque);
    }

    public static void main(String[] args) {
        DequeStack dequeStack = new DequeStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'push <element>', 'pop', 'enqueue <element>', or 'exit' to stop: ");
            String userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            } else if (userInput.toLowerCase().startsWith("push ")) {
                String element = userInput.substring(5).trim();
                dequeStack.push(element);
            } else if (userInput.equalsIgnoreCase("pop")) {
                dequeStack.pop();
            } else if (userInput.toLowerCase().startsWith("enqueue ")) {
                String element = userInput.substring(8).trim();
                dequeStack.enqueue(element);
            } else {
                System.out.println("Invalid command. Please enter 'push <element>', 'pop', 'enqueue <element>', or 'exit'.");
            }

            dequeStack.display();
        }

        System.out.println("DequeStack processing complete.");
        scanner.close();
    }
}
