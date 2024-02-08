package copilot.exercises.ex05.p01;

public class Smartphone extends Device{
    @Override
    public void powerOn() {
        System.out.println("Smartphone is Powering on...");
    }
    @Override
    public void userDevice() {
        System.out.println("Smartphone is userd");
    }

}
