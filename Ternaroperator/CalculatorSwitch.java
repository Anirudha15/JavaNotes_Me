
// 58 Create a program to create simple calculator that uses a switch statement to perform basic arithemitic operations

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator\n");
        System.out.println("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Now enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Now enter the operation: ");
        String operation = input.next();

        float result = switch(operation){
            case"+" -> num1+num2;
            case"-" -> num1-num2;
            case"*" -> num1*num2;
            case"/" -> num1/num2;
            default -> -1;
          

        };

        System.out.println("Your answer is: "+ result);
        input.close();
    }
    
}
