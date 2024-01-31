package dk.kea;

public class Motorcycle implements Vehicle {
    @Override
    public void drive(){
        System.out.println("Starting motorbike");
    }

    @Override
    public void stop() {
        System.out.println("Stopping motorbike");
    }

}
