public class MethodsExample {
    public static void main(String[] args) {
        greet();
        System.out.println("Sum: " + add(5, 10));
        System.out.println("Sum: " + add(5, 10, 15));
        System.out.println("Factorial of 5: " + factorial(5));
    }

    // Basic Method
    static void greet() {
        System.out.println("Hello! Welcome to Java");
    }

    // Method with parameters and return value
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
