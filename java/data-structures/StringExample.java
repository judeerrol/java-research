public class StringExample {
    public static void main(String[] args) {
        // Creating String
        String text = "Hello, World!";

        // Length of string
        System.out.println("Length: " + text.length());

        // Character at index
        System.out.println("Character at index 1: " + text.charAt(1));

        // Substring
        System.out.println("Substring (0-5): " + text.substring(0, 5));

        // Convert to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // Convert to lowercase
        System.out.println("Uppercase: " + text.toLowerCase());

        // Replace a word
        System.out.println("Replace 'World' with 'Java': " + text.replace("World", "Java"));
    }
}
