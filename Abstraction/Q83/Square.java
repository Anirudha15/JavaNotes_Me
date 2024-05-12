package Abstraction.Q83;

public class Square extends Shape{


    private final double sideInCms;

    
    
    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms, 2);
    }



    public double getSideInCms() {
        return sideInCms;
    }
    
}
