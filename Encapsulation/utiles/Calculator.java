package Encapsulation.utiles;
import Encapsulation.geometry.Circle;
import Encapsulation.geometry.Rectangle;

public class Calculator {
    
   
    public static void main(String[] args) {
        
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);

        double cirArea = Math.PI*Math.pow(cir.radius,2);
        double reactArea = rect.breath * rect.length;

        System.out.printf("Area of circle is: %f, Area of the reactangle is: %f", cirArea,reactArea);
    }
}
