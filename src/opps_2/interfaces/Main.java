package opps_2.interfaces;

interface Pet {
    void eat();
}

interface Animal {
    void makesound();
}

class Dog implements Animal, Pet {
    @Override
    public void makesound() {
        System.out.println("The dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }
}

class Cow implements Animal, Pet {
    @Override
    public void makesound() {
        System.out.println("The cow goes mow mow");
    }

    @Override
    public void eat() {
        System.out.println("The cow is eating");
    }

    public void speak() {
        System.out.println("The cow is speaking");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        Cow myCow = new Cow();

        myDog.makesound();
        myDog.eat();

        myCow.speak();
        myCow.makesound();
        myCow.eat();
    }
}