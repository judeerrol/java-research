// Encapsulation - Data hiding using getters and setters
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return this.age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 26);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modify attributes using setters
        person.setName("Bob");
        person.setAge(30);
        System.out.println("Update name: " + person.getName());
        System.out.println("Update age: " + person.getAge());
    }
}
