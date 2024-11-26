package opps_2.Abstraction;

abstract class Animal {

    // Abstract method (does not have a body)
    abstract void makeSound();

    // Regular method
    void sleep() {
        System.out.println("This animal is sleeping");
    }
}

    // Subclass that provides an implementation of the abstract method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {

        // Create object of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
        myDog.sleep();
        System.out.println();
    }
}
