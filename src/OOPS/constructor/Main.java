package OOPS.constructor;

public class Main {
    public static void main(String[] args) {

        myMacmini Apple = new myMacmini("apple", "mac mini", 512, 8);
        myMacmini dell = new myMacmini("dell", "alienware", 512, 12);

        System.out.println("company name is :" + Apple.company);
        System.out.println("Model is :" + Apple.model);
        System.out.println("company name is :" + dell.company);
        System.out.println("Model is : " + dell.model);

        Apple.Turnon();
        Apple.Turnoff();
        dell.boot();
    }
}

class myMacmini {

    String company;
    String model;
    int storage;
    double ram;
    myMacmini(String company, String model, int storage, double ram) {
        this.company = company;
        this.model = model;
        this.storage = storage;
        this.ram = ram;
    }

    void Turnon() {
        System.out.println("You turn on the mac");
    }

    void Turnoff() {
        System.out.println("You turn off the mac");
    }

    void boot() {
        System.out.println("you boot the pc");
    }
}
