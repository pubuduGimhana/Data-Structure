package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FifoSimpleList {

    public static void main(String[] args) {
        List<String> stack = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Take user input for push or pop operation
            System.out.print("Enter an element to push, 'pop' to pop, or 'exit' to stop: ");
            String userInput = scanner.nextLine().trim();

            // Check if the user wants to exit
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            // Push operation
            else if (!userInput.equalsIgnoreCase("pop")) {
                stack.add(userInput);
                System.out.println("Pushed: " + userInput);
            }

            // Pop operation
            else if (userInput.equalsIgnoreCase("pop")) {
                if (!stack.isEmpty()) {
                    String element = stack.remove(stack.size() - 1);
                    System.out.println("Popped: " + element);
                } else {
                    System.out.println("Stack is empty, cannot pop.");
                }
            }

            // Show the current state of the LIFO stack
            System.out.println("Current LIFO stack: " + stack);
        }

        System.out.println("Stack processing complete.");
        scanner.close();
    }
}
