import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating Array List (Dynamic Array)
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Daisy");

        // Accessing elements
        System.out.println("First: " + names.getFirst());

        // Removing an element
        names.remove("Daisy");

        // Iterating through the list
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
