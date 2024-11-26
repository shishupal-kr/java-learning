package opps_1.Classes_Object;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat();
        Dog d2 = new Dog();
        d2.name="Tommy";
        d2.walk();
        Cat c1 = new Cat();
        c1.eat();
        Bird b1 = new Bird();
        b1.eat();
        b1.fly();
        Fish f1 = new Fish();
        f1.age=1;
        f1.eat();
        f1.swim();
        f1.age();

    }
}

class Dog{
    String name;
    int age;
    String color;

    void eat(){
        System.out.println("dog is eating..");
    }
    void walk(){
        System.out.println(name + " is walking..");
    }
}

class Cat{
    String name;
    String Breed;
    void eat(){
        System.out.println("cat is eating..");
    }
    void walk(){
        System.out.println("cat is walking..");
    }
}

class Bird{
    String name;
    void eat(){
        System.out.println("bird is eating..");
    }
    void fly(){
        System.out.println("bird is flying..");
    }
}

class Fish{
    int age;
    String species;
    void eat(){
        System.out.println("fish is eating..");
    }
    void swim(){
        System.out.println("fish is swimming...");
    }
    void age(){
        System.out.println(age + " year old");
    }

}