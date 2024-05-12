package Dowhileloop;

import java.util.Scanner;

// Create a program using do while to find password checker until a vaild password is entered.

public class passwordChecker {
    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcomme to Set your password\n");
       
        String passsword;
        do{
            System.out.print("Please enter your passsword: ");
            passsword = input.next();
        } while (!isValidPassword(passsword));  
        System.out.println("Thanks for entering a valid password");
       


        input.close();
        
    }



    public static boolean isValidPassword(String password){

        return password.length()>7;
    }
}
