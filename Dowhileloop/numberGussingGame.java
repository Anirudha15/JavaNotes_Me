package Dowhileloop;


// Program usind do while loop to implement a number guessing game.

import java.util.Scanner;

public class numberGussingGame {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("Welcome to the number gussing game ");
        do{
            System.out.println("Please guess the number between 0 to 10");
            guess = input.nextInt();
        } while(num != guess);
        System.out.println("You have sucessfully gussed the number");
        
        input.close();
    }
}
