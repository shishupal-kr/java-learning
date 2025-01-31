package OOPS.polymorphism;

//polymorphism is like inheritance
class Animal {    //superclass
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {    //subclass
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {   //subclass
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myPig = new Pig();        // Create a Pig object, but reference it as Animal
        Animal myDog = new Dog();        // Create a Dog object, but reference it as Animal

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
