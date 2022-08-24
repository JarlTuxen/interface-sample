package dk.kea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());

        for(Vehicle v:vehicles){
            v.drive();
            v.stop();
        }
    }
}
