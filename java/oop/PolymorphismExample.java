// Compile-time polymorphism - method overloading
class MathOperations {
    // Method with two parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Runtime polymorphism - method overriding
class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }
}

class Truck extends Vehicle {
    // Overriding the parent method
    @Override
    public void startEngine() {
        System.out.println("Truck engine is starting with a roar!");
    }
}


public class PolymorphismExample {
    public static void main(String[] args) {
        // Compile-time polymorphism - method overloading
        MathOperations math = new MathOperations();
        System.out.println("Sum (2 numbers): " + math.add(5, 10));
        System.out.println("Sum (3 numbers): " + math.add(5, 10, 15));

        // Runtime polymorphism - method overriding
        Vehicle truck = new Truck();
        truck.startEngine();
    }
}
