// Abstraction - Hiding implementation using abstract classes and interfaces

// Abstract class
abstract class Shape {
    abstract void draw(); // Abstract method (no implementation)
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Interface
interface Canidae {
    void makeSound(); // Abstract method (no implementation)
}

class Wolf implements Canidae {
    @Override
    public void makeSound() {
        System.out.println("Howl!");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Abstract class
        Shape circle = new Circle();
        circle.draw(); // Calls the implemented method in Circle

        // Interface
        Canidae wolf = new Wolf();
        wolf.makeSound(); // Calls the implemented method in Wolf
    }
}
