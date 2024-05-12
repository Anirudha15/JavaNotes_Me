// program using for each to the occurences of a specific element in an array.

package forLoop;

import java.util.Scanner;


public class occurencessForEach {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurences");
        int[] nums = maximunValue.inputArray();
        System.out.print("Now enter the number you want to search: ");
        int element = input.nextInt();
        int occ = countOccurencess(nums, element);
        System.out.println("Your element was found: " + occ + "times");

        input.close();

    }

    public static int countOccurencess(int[] nums, int element){

        int occ = 0;
        for(int num : nums){
            if (num == element){
                occ++;
            }
        }
        return occ;
    }


}
