package Recursion;

import java.util.Scanner;

public class resursion {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Factorial generation:\n");
        System.err.println("Please enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of your number is: " + fact);


        input.close();
    }

    // using recursion

    public static long factorial(int num){
        System.out.println("Function called for: " + num);
        if(num ==1){
            return 1;
        }
        return num* factorial(num-1);

    }

    // using function 
      
    public static long factorialIterative(int num){
        long result = 1;
        for (int i =1;i<=num;i++){
            result *=1;
        }


        return result;
    }
}
