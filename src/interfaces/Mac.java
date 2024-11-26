package interfaces;

//interface implementing two methods at same time
class Mac implements TurnOn, TurnOff {

    public void turnOn() {
        System.out.println("Turning on...");
    }
    public void turnOff() {
        System.out.println("Turning off...");
    }
}