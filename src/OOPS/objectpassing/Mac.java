package OOPS.objectpassing;

public class Mac{

    String company;
    String model;

    Mac(String company, String model){
        this.company = company;
        this.model = model;
    }

    //2nd class
    public static class Courier {
        //method
        void Delivery(Mac laptop){
            System.out.println("your item is delivered : " +laptop.company + " " + laptop.model);

        }
    }
    public static void main(String[] args){

        Courier partner = new Courier();

        Mac myMac = new Mac("Apple","Macbook Air");
        Mac myMac1 = new Mac("Apple","Macbook Pro");

        partner.Delivery(myMac);     //Running the method
        partner.Delivery(myMac1);    //

    }
}
