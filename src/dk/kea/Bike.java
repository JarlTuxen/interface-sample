package dk.kea;

public class Bike implements Vehicle {


    @Override
    public void drive() {
        System.out.println("biking");
    }

    @Override
    public void stop() {
        System.out.println("bike parked");
    }
}
