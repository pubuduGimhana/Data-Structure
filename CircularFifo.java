package DataStructure;

import java.util.Scanner;

public class CircularFifo {
    private int size;
    private String[] queue;
    private int head;
    private int tail;

    public CircularFifo(int size) {
        this.size = size;
        this.queue = new String[size];
        this.head = -1;
        this.tail = -1;
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public void enqueue(String element) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            head = 0;
        }
        tail = (tail + 1) % size;
        queue[tail] = element;
        System.out.println("Enqueued: " + element);
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue.");
            return null;
        }
        String element = queue[head];
        if (head == tail) {
            head = tail = -1;
        } else {
            head = (head + 1) % size;
        }
        System.out.println("Dequeued: " + element);
        return element;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Current FIFO queue: ");
            if (tail >= head) {
                for (int i = head; i <= tail; i++) {
                    System.out.print(queue[i] + " ");
                }
            } else {
                for (int i = head; i < size; i++) {
                    System.out.print(queue[i] + " ");
                }
                for (int i = 0; i <= tail; i++) {
                    System.out.print(queue[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the circular FIFO queue: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        CircularFifo fifoQueue = new CircularFifo(size);

        while (true) {
            System.out.print("Enter an element to enqueue, 'dequeue' to dequeue, or 'exit' to stop: ");
            String userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            } else if (userInput.equalsIgnoreCase("dequeue")) {
                fifoQueue.dequeue();
            } else {
                fifoQueue.enqueue(userInput);
            }

            fifoQueue.display();
        }

        System.out.println("Queue processing complete.");
        scanner.close();
    }
}
