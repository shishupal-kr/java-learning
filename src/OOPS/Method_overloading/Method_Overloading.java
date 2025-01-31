package OOPS.Method_overloading;

public class Method_Overloading {
    public static void main(String[] args) {

    Greet g1 = new Greet();
    g1.greeting();
    g1.greeting("shishupal");
    }
}

class Greet{
    void greeting(){
        System.out.println("hello how are you");
    }
    void greeting(String name){
        System.out.println("Hello " + name + " how are you..");
    }
}