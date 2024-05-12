package Inheritance;

public class InheritanceTest {
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        twoWheeler TwoWheeler = new twoWheeler();
        TwoWheeler.commute();
        System.out.println();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();

        
    }
}
