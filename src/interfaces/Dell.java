package interfaces;

//interface implementing one methods at same time
class Dell implements TurnOff {

    public void turnOff() {
        System.out.println("Dell is turning off...");
    }

    public void Charge(){
        System.out.println("Dell Lappy is chaging....");
    }
}
