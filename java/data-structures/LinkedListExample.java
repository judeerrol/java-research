import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating Linked List
        // Doubly Linked Nodes - each node contains pointers to both previous and next node
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Adding at a specific position
        list.addFirst("Mango");
        list.addLast("Orange");

        // Removing an element
        list.remove("Banana");

        System.out.println("Updated list: " + list);
    }
}
