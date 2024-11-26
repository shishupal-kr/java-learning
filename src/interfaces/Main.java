package interfaces;

// you can also write the all code here in one page
// but writing in separate pages is best practise

public class Main {
    public static void main(String[] args) {

        //object of Mac class
        Mac mymac = new Mac();
        mymac.turnOn();
        mymac.turnOff();

        //object of Dell class
        Dell mydell = new Dell();
        mydell.turnOff();
        mydell.Charge();

    }
}
