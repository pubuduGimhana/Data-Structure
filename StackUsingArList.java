package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackUsingArList {

    // Function to push elements onto the stack
    public static void push(List<String> stack, String item) {
        stack.add(item);
    }

    // Function to pop elements from the stack
    public static String pop(List<String> stack) {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public static void main(String[] args) {
        List<String> stack = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'push' to add an element, 'pop' to remove an element, or 'quit' to exit: ");
            String action = scanner.nextLine().trim().toLowerCase();

            if (action.equals("push")) {
                System.out.print("Enter the element to push onto the stack: ");
                String item = scanner.nextLine();
                push(stack, item);
                System.out.println("Pushed " + item + " onto the stack.");
            } else if (action.equals("pop")) {
                String item = pop(stack);
                if (item != null) {
                    System.out.println("Popped " + item + " from the stack.");
                }
            } else if (action.equals("quit")) {
                System.out.println("Exiting.");
                break;
            } else {
                System.out.println("Invalid action. Please enter 'push', 'pop', or 'quit'.");
            }
        }

        System.out.println("Final stack: " + stack);
        scanner.close();
    }
}
