package forLoop;

import java.util.Scanner;

// Create a program using for each to find the maximum value in an integer arrray

public class maximunValue {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to finding the maximum\n");
        int[] arr = inputArray();

        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(max < num){
                max = num;
            }
        }
       System.out.println("Maximum number is: " + max);
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


