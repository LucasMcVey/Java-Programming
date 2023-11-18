package practical09;

import java.util.ArrayList;

public class Car extends Vehicle {

    String carmodel = "";
    String cartype = "";
    Car(int theCapacity, String theMake, String theType, String theModel)
    {
        super(theCapacity,theMake);
        cartype = theType;
        carmodel = theModel;
    }
    void print()
    {
        super.print();
        System.out.println(" type = " + cartype );
        System.out.println(" model = " + carmodel );
    }
    void setCapacity(int newCapacity)
    {
        System.out.println("Cannot change capacity of a car");

    }

}
class VehicleDB {
    ArrayList<Vehicle> db = new ArrayList<Vehicle>();

    void addVehicle(Vehicle c) {
        db.add(c);
    }

    void print() {
        System.out.println("=== Vehicle Data Base ===");
        for (Vehicle v : db) {
            v.print();
        }
    }
}
