public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an exception
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide zero.");
        } finally {
            System.out.println("This will always execute.");
        }
    }
}
