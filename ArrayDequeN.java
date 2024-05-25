package DataStructure;

import java.util.ArrayDeque;

import java.util.Deque;
import java.util.Scanner;

public class ArrayDequeN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		        Deque<Object> stack = new ArrayDeque<>();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("Choose an operation:");
		            System.out.println("1: Push an element");
		            System.out.println("2: Pop an element");
		            System.out.println("3: Peek at the top element");
		            System.out.println("4: Check if the stack is empty");
		            System.out.println("5: Exit");

		            int choice = scanner.nextInt();
		            scanner.nextLine(); // consume the newline character
		            switch (choice) {
		                case 1:
		                    System.out.print("Enter  element to push onto the stack: ");
		                    String input = scanner.nextLine();
		                    Object element = parseInput(input);
		                    stack.push(element);
		                    System.out.println("Pushed " + element + " onto the stack.");
		                    break;
		                case 2:
		                    if (stack.isEmpty()) {
		                        System.out.println(" stack is empty. Nothing to pop.");
		                    } else {
		                        Object poppedValue = stack.pop();
		                        System.out.println("Popped: " + poppedValue);
		                    }
		                    break;
		                case 3:
		                    if (stack.isEmpty()) {
		                        System.out.println(" stack is empty.Nothing to peek.");
		                    } else {
		                        Object topValue = stack.peek();
		                        System.out.println("Peek: " + topValue);
		                    }
		                    break;
		                case 4:
		                    if (stack.isEmpty()) {
		                        System.out.println(" stack is empty.");
		                    } else {
		                        System.out.println("stack is not empty.");
		                    }
		                    break;
		                case 5:
		                    System.out.println("Exiting");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println(" Please try again.");
		            }
		        }
		    }

		    private static Object parseInput(String input) {
		        try {
		            return Integer.parseInt(input);
		        } catch (NumberFormatException e1) {
		            try {
		                return Double.parseDouble(input);
		            } catch (NumberFormatException e2) {
		                return input; // return the input string if it's neither an integer nor a double
		            }
		        }
		    }
}
		    
