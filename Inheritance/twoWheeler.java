package Inheritance;

public class twoWheeler extends Vehicle {
    
    twoWheeler(){
      setNumberOfTires(2);
    }

    public void balance(){
        System.out.println("I am balancing on two tires");
    }
}
