import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        // Creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Reading user input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Reading an integer
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "! You are " + age + " years old.");

        // Closing scanner object
        scanner.close();
    }
}
