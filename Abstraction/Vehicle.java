package Abstraction;

public abstract class Vehicle implements Interface{
    
    
    private int noOfTires;

   public abstract void makeStartSound();

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }



    public int getNoOfTires() {
        return noOfTires;
    }



    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }



    public void commute(){
        System.out.println("Going....");
    }
}





