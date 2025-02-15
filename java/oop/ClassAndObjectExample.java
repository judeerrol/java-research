// Class definition
class Car {
    // Class attributes (fields)
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Class method
    void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }
}

public class ClassAndObjectExample {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Toyota", "Hilux", 2025);
        Car car2 = new Car("Nissan", "Navarra", 2025);

        // Calling methods on objects
        car1.displayInfo();
        car2.displayInfo();
    }
}
