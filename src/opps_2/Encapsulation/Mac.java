package opps_2.Encapsulation;

public class Mac{

    //Encapsulating confidential things
    private  String company;
    public String model;
    protected int year;

    Mac(String company,String model,int year){
        this.company = company;
        this.model = model;
        this.year = year;
    }

    //Getter method,  to used by another class
    public String getCompany(){
        return company;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    /* Setter methods ,  to use by another class
    setter methods are typically defined with the void return type
    because they do not return any value. The purpose of a setter is to
    modify the value of a private field without returning anything.
     */
    public void setCompany(String company) {
        this.company = company;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
}