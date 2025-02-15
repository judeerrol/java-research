// Parent class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Overriding the parent method
    @Override
    void makeSound() {
        System.out.println(this.name + " says: Woof! Woof!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound(); // Calls overridden method
    }
}
