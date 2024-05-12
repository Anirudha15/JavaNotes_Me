
// Create program using continue to sum all positive numbers entered by the user; skip any negative numbers

package Dowhileloop;

import java.util.Scanner;

public class usingContinueSumOfPositive {
    

    public static void main(String[] args) {
        
        System.out.println("Welcome to adding positive numbers. ");
        int[] numArr = inputArray();

        int sum = 0;
        for (int num : numArr){
            if(num<0){
                continue;
            }

            sum +=num;
        }
        System.out.println("The sum of positive numbers is: " + sum);
    }



    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of element: ");
        int size = input.nextInt();
        int[] nums = new int [size];
        int i = 0;
        while(i < size){
            System.out.print("Please enter element no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        input.close();
        return nums;
    
    }
}

