public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating String Builder
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(", World!");
        System.out.println("Appended: " + sb);

        // Insert text at a position
        sb.insert(5, " Java");
        System.out.println("Inserted: " + sb);

        // Delete part of string
        sb.delete(5, 10);
        System.out.println("Deleted: " + sb);

        // Reverse string
        System.out.println("Reversed: " + sb.reverse());
    }
}
