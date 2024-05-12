package Polymorphism;

public class TestTransportation {
   
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
        // castTest(v);
        castTest(c);
        Plane p = new Plane(); 
        // castTest(p);
        // Vehicle vcar = new Car();  upcasting
        // Car cVehicle = new Vehicle();    not supported

        /* 
        Vehicle ve = new Car(); 
        Car ca = (Car)ve;             #Downcasting
        */
    }

    private static void castTest(Vehicle veh){
        // veh.Start();
        Car cVehicle = (Car) veh;
        // veh.noOfDoors; error
        cVehicle.Start();
        // cVehicle.noOfDoors();
    }
}
