import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue (FIFO - First In, First Out)
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Removing and accessing elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Front element: " + queue.peek());

        // Checking if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
