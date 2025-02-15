public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        boolean x = true, y = false;
        int z = 3;

        // Arithmetic Operators
        System.out.println("Sum: " + (a + b));              // Addition
        System.out.println("Difference: " + (a - b));       // Subtraction
        System.out.println("Product: " + (a * b));          // Multiplication
        System.out.println("Quotient: " + (a / b));         // Division
        System.out.println("Remainder: " + (a % b));        // Modulus

        // Comparison Operators
        System.out.println(a == b);     // false
        System.out.println(a != b);     // true
        System.out.println(a > b);      // true
        System.out.println(a < b);      // false
        System.out.println(a >= b);     // true
        System.out.println(a <= b);     // false

        // Logical Operators
        System.out.println(x && y);     // false (AND)
        System.out.println(x || y);     // true (OR)
        System.out.println(!x);         // false (NOT)

        // Assignment Operators
        z += 3;                     // z = z + 3
        z -= 3;                     // z = z - 3
        z *= 3;                     // z = z * 3
        z /= 3;                     // z = z / 3
        z %= 3;                     // z = z % 3
        System.out.println(z);      // 0
    }
}
