package opps_2.inheritance;
public class Main {

    public static class Vehicle{   //Superclass
        double speed;
        void Start(){
            System.out.println("Your Vehicle is Moving");
        }
        void Stop(){
            System.out.println("Your Vehicle is Stopped");
        }
    }
    public static class Car extends Vehicle{
        int wheels = 4;
        int door = 5;
        int camera = 4;
    }
    public static class Bicycle extends Vehicle {
        int wheels =2;
        int pedal = 2;
    }
    public static void main(String[] args){
        Car car = new Car();
        Bicycle bike = new Bicycle();

        car.Start();
        bike.Stop();
        System.out.println("no. of wheels :" +bike.wheels);
        System.out.println("no. of doors :"+ car.door);
        System.out.println("no. of Camera :" +car.camera);
    }
}