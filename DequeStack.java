import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Steque<T> {
    private LinkedList<T> list;

    public Steque() {
        list = new LinkedList<>();
    }

    // Push operation (adds to the front of the steque)
    public void push(T item) {
        list.addFirst(item);
    }

    // Enqueue operation (adds to the end of the steque)
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Pop operation (removes from the front of the steque)
    public T pop() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Pop from an empty steque");
        }
        return list.removeFirst();
    }

    // Check if the steque is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the steque
    public int size() {
        return list.size();
    }

    // Peek at the front item of the steque without removing it
    public T peek() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Peek from an empty steque");
        }
        return list.getFirst();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Steque<Integer> steque = new Steque<>();

        // Testing the steque operations
        steque.push(1);
        steque.push(2);
        steque.enqueue(3);
        steque.enqueue(4);
        System.out.println("Steque after push and enqueue operations: " + steque);

        System.out.println("Pop: " + steque.pop());
        System.out.println("Steque after pop: " + steque);

        System.out.println("Peek: " + steque.peek());
        System.out.println("Steque after peek: " + steque);

        steque.push(5);
        steque.enqueue(6);
        System.out.println("Steque after more operations: " + steque);

        while (!steque.isEmpty()) {
            System.out.println("Pop: " + steque.pop());
        }

        System.out.println("Steque after emptying: " + steque);
    }
}
