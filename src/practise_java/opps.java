package practise_java;

public class opps {

    public static void main(String[] args) {
        // Creating instances of the Mac class
        Mac mac1 = new Mac("Macbook Air M2", 2022, "Apple", 256);

        System.out.println("Mac 1:");
        mac1.turnOn();
        mac1.turnOff();

    }
}

// Defining the Mac class
class Mac {
    String model;
    int year;
    String company;
    int storage;

    // Constructor
    Mac(String model, int year, String company, int storage) {
        this.model = model;
        this.year = year;
        this.company = company;
        this.storage = storage;
    }

    // Method to turn on the Mac
    void turnOn() {
        System.out.println("Your " + model + " (" + year + ") is turned on.");
    }

    // Method to turn off the Mac
    void turnOff() {
        System.out.println("Your " + model + " (" + year + ") is turned off.");
    }
}