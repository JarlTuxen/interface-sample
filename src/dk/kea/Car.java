package dk.kea;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("superfast to max speed");
    }

    @Override
    public void stop() {
        System.out.println("tried to break but couldn't");
    }
}
