

// Create a program using recursion to display the fibonacci series upto a ccertain number

package Recursion;

import java.util.Scanner;

public class fibonacciSeries {

    
    public static void main(String[] args) {
        
        System.out.println("Welcom to fibonacci series using recursion: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements to be printed: ");
        int count = input.nextInt();
        for(int i =1;i<=count;++i){
            System.out.println(fibonacci(i) + " ");
        }
        
        input.close();
    }

    public static int fibonacci(int position){
        System.out.print(".");
        if(position ==1){
            return 0;
        }
        if(position ==2){
            return 1;
        }
        return fibonacci(position-1) + fibonacci(position -2);
    }
}
