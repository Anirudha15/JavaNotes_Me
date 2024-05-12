package Inheritance;

public class Vehicle {
    
    private int numberOfTires;

    //setter 
    public void setNumberOfTires(int numberOfTires){
        this.numberOfTires = numberOfTires;
    }

    public void commute(){
        System.out.printf("I am going from place A to place B using %d tires\n ", numberOfTires);
    }
}
