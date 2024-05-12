
// Create a program using rrecursion to check if a string is a palindrom using recursion

package Recursion;

import java.util.Scanner;

public class palindromUsingRecursion {
    

    public static void main(String[] args) {
        
        System.out.println("Welcome to Palindrom Checker ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sting to be checked: ");
        String str = input.next();
        System.out.println("Your string is" + ((isPalindrome(str) ? " Palindrome"
                                                                :" Not Palindrome")));


        input.close();
    }

    public static boolean isPalindrome(String str){

        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length() -1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newSrt = str.substring(1, lastPos);
        return isPalindrome(newSrt);
    }
}
