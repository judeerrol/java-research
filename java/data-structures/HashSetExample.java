import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating HashSet (Unique elements, No duplicates)
        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate, won't be added

        // Checking for an element
        System.out.println("Contains 20? " + numbers.contains(20));

        // Iterating through HashSet
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
