package copilot.exercises.ex05.p01;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        device.powerOn();
        device.userDevice();
        
        Smartphone smartphone = new Smartphone();
        smartphone.powerOn();
        smartphone.userDevice();
        
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.userDevice();
    }

}
