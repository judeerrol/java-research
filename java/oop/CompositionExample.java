// Composition (HAS-A Relationship)
class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

// Class contains an instance of another class instead of inheriting from it
class Motorcycle {
    private Engine engine; // Motorcycle has an engine

    public Motorcycle() {
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println("Motorcycle is ready to drive!");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Motorcycle motor = new Motorcycle();
        motor.start(); // Calls engine's start method
    }
}
