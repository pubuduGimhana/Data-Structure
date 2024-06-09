package DataStructure;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DequeUsingTwoFIFOQueues {

    private LinkedList<Integer> leftQueue;
    private LinkedList<Integer> rightQueue;

    public DequeUsingTwoFIFOQueues() {
        leftQueue = new LinkedList<>();
        rightQueue = new LinkedList<>();
    }

    // Add to front
    public void pushFront(int item) {
        leftQueue.addLast(item);
    }

    // Add to rear
    public void pushBack(int item) {
        rightQueue.addLast(item);
    }

    // Remove from front
    public int popFront() {
        try {
            if (leftQueue.isEmpty()) {
                while (!rightQueue.isEmpty()) {
                    leftQueue.addLast(rightQueue.removeLast());
                }
            }
            if (leftQueue.isEmpty()) {
                throw new NoSuchElementException("popFront from an empty deque");
            }
            return leftQueue.removeLast();
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
            return -1;  // Return a default value or handle the error appropriately
        }
    }

    // Remove from rear
    public int popBack() {
        try {
            if (rightQueue.isEmpty()) {
                while (!leftQueue.isEmpty()) {
                    rightQueue.addLast(leftQueue.removeLast());
                }
            }
            if (rightQueue.isEmpty()) {
                throw new NoSuchElementException("popBack from an empty deque");
            }
            return rightQueue.removeLast();
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
            return -1;  // Return a default value or handle the error appropriately
        }
    }

    // Peek front
    public int peekFront() {
        try {
            if (leftQueue.isEmpty()) {
                while (!rightQueue.isEmpty()) {
                    leftQueue.addLast(rightQueue.removeLast());
                }
            }
            if (leftQueue.isEmpty()) {
                throw new NoSuchElementException("peekFront from an empty deque");
            }
            return leftQueue.peekLast();
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
            return -1;  // Return a default value or handle the error appropriately
        }
    }

    // Peek rear
    public int peekBack() {
        try {
            if (rightQueue.isEmpty()) {
                while (!leftQueue.isEmpty()) {
                    rightQueue.addLast(leftQueue.removeLast());
                }
            }
            if (rightQueue.isEmpty()) {
                throw new NoSuchElementException("peekBack from an empty deque");
            }
            return rightQueue.peekLast();
        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
            return -1;  // Return a default value or handle the error appropriately
        }
    }

    // Check if deque is empty
    public boolean isEmpty() {
        return leftQueue.isEmpty() && rightQueue.isEmpty();
    }

    // Get the size of the deque
    public int size() {
        return leftQueue.size() + rightQueue.size();
    }

    public static void main(String[] args) {
        DequeUsingTwoFIFOQueues deque = new DequeUsingTwoFIFOQueues();
        deque.pushFront(1);
        deque.pushBack(2);
        deque.pushFront(3);
        deque.pushBack(4);

        System.out.println(deque.popFront());  // Output: 3
        System.out.println(deque.popBack());   // Output: 4
        System.out.println(deque.peekFront()); // Output: 1
        System.out.println(deque.peekBack());  // Output: 2

        deque.pushFront(5);
        deque.pushBack(6);
        System.out.println(deque.popFront());  // Output: 5
        System.out.println(deque.popBack());   // Output: 6

        // Testing error handling
        deque.popFront();
        deque.popBack();
        System.out.println(deque.popFront());  // Output: Error message and -1
        System.out.println(deque.popBack());   // Output: Error message and -1
    }
}
