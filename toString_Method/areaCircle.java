
// Calculate the area and circumferance of a circle  with radius using Math.PI.

package toString_Method;

import java.util.Scanner;

public class areaCircle {
    double rediusInMm;

    // Construtor
    areaCircle(double rediusInMm){
         this.rediusInMm = rediusInMm;
    }

    double getCircumference(){
        return 2*rediusInMm*Math.PI;
    }

    double getArea(){
        return Math.PI* Math.pow(rediusInMm, 2);
    }

    @Override
    public String toString() {
       
        return "Circle props: Radius in nm:"+ rediusInMm +", Circumference in mn: " + getCircumference() +", Area in mm2:" + getArea() ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to circle");
        System.out.println("Please enter your radius: ");
        double radius = input.nextDouble();
        areaCircle c1 = new areaCircle(radius);

        // traditional way calling function
        System.out.println(c1.rediusInMm);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());

        // using to string to print whole areacircle
        System.out.println(c1);

        input.close();
    }
}
