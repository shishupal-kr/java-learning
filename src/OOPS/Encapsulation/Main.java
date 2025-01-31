package OOPS.Encapsulation;

public class  Main{
    public static void main(String[] args){

        Mac myMac = new Mac("Apple","Macbook Air M2",2022);

        //get method
        System.out.println(myMac.getCompany());
        System.out.println(myMac.getModel());
        System.out.println(myMac.getYear());

       //set method
        myMac.setCompany("dell");
        myMac.setModel("inspiron");
        myMac.setYear(2020);

        System.out.println(myMac.getCompany());
        System.out.println(myMac.getModel());
        System.out.println(myMac.getYear());

        myMac.setYear(2014);
        System.out.println(myMac.getYear());
    }
}




