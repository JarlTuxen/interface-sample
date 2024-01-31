package dk.kea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        //Add vehicles
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Motorcycle());

        //use all the vehicles
        //polimophism allows use af same methods on all
        for(Vehicle v:vehicles){
            v.drive();
            v.stop();
        }
    }
}
