package Abstraction;

public class Car extends Vehicle{

    public int noOfDoor;
 
    public Car(int noOfTires) {
        super(noOfTires);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vrommmm.....");
    }

   public void getSetGo(){
        System.out.println("goin to place");
   }
       


}
