import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating Hash Map
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Adding key-value pairs
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 92);

        // Accessing values by key
        System.out.println("Alice's grade: " + studentGrades.get("Alice"));

        // Iterating through HashMap
        for (String name : studentGrades.keySet()) {
            System.out.println(name + ": " + studentGrades.get(name));
        }
    }
}
