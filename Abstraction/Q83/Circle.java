package Abstraction.Q83;



public class Circle extends Shape{
    
    private final double radiusInCms;

    public Circle(double radiusInCms){
        this.radiusInCms = radiusInCms;
    }

    public double getcalculateArea(){
        return radiusInCms;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
