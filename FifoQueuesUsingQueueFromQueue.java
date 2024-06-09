package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class FifoQueuesUsingQueueFromQueue {

    public static void main(String[] args) {
        // Create a FIFO queue using the Queue interface and LinkedList implementation
        Queue<String> fifoQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Take user input for enqueue or dequeue operation
            System.out.print("Enter an element to enqueue, 'dequeue' to dequeue, or 'exit' to stop: ");
            String userInput = scanner.nextLine().trim();

            // Check if the user wants to exit
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            // Enqueue operation
            else if (!userInput.equalsIgnoreCase("dequeue")) {
                fifoQueue.add(userInput);
                System.out.println("Enqueued: " + userInput);
            }

            // Dequeue operation
            else if (userInput.equalsIgnoreCase("dequeue")) {
                if (!fifoQueue.isEmpty()) {
                    String element = fifoQueue.poll();
                    System.out.println("Dequeued: " + element);
                } else {
                    System.out.println("Queue is empty, cannot dequeue.");
                }
            }

            // Show the current state of the FIFO queue
            System.out.println("Current FIFO queue: " + fifoQueue);
        }

        System.out.println("Queue processing complete.");
        scanner.close();
    }
}
