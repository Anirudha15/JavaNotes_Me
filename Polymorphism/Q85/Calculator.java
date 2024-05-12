

// Create a class calculator , create multiple add() methods that overload each other and can sum two interger, three integer
// or two doubles. Demonstrate how each can be called with different number of parameters.

package Polymorphism.Q85;

public class Calculator {
    
    public int add (int first, int second){
        return first + second;
    }

    public int add (int first,int second, int third){
        return first+second+third;
    }

    public double add(double first,double second){
        return first+second;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.add(20, 10, 10));
        System.out.println(calculator.add(20.3, 19.8));
    }

}
