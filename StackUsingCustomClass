import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomQueue {
    private Queue<String> queue;

    public CustomQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(String item) {
        queue.add(item);
    }

    public String dequeue() {
        if (!queue.isEmpty()) {
            return queue.poll();
        } else {
            throw new RuntimeException("dequeue from empty queue");
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public String peek() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            throw new RuntimeException("peek from empty queue");
        }
    }

    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'enqueue' to add an element, 'dequeue' to remove an element, or 'quit' to exit: ");
            String action = scanner.nextLine().trim().toLowerCase();

            if (action.equals("enqueue")) {
                System.out.print("Enter the element to enqueue into the queue: ");
                String item = scanner.nextLine();
                customQueue.enqueue(item);
                System.out.println("Enqueued " + item + " into the queue.");
            } else if (action.equals("dequeue")) {
                try {
                    String item = customQueue.dequeue();
                    System.out.println("Dequeued " + item + " from the queue.");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            } else if (action.equals("quit")) {
                System.out.println("Exiting.");
                break;
            } else {
                System.out.println("Invalid action. Please enter 'enqueue', 'dequeue', or 'quit'.");
            }
        }

        System.out.println("Final queue: " + customQueue.queue);
        scanner.close();
    }
}
