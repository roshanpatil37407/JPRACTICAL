// Base class (Parent class)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Derived class (Child class)
class Dog extends Animal {
    public Dog(String name) {
        // Call the constructor of the base class
        super(name);
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Derived class (Child class)
class Cat extends Animal {
    public Cat(String name) {
        // Call the constructor of the base class
        super(name);
    }

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating objects of derived classes
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Calling methods from the base class
        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();

        // Calling methods specific to derived classes
        dog.bark();
        cat.meow();
    }
}
