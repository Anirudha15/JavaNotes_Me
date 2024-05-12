// Create program to find number of occurrences of an element in an array.

import java.util.Scanner;


public class OccurancesArray {
     
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurance\n");
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now enter the number you want to find");
        int num = input.nextInt();
        int Occurrences = noOfOccurrences(numArr, num);
        System.out.println("Yuor element was found"  +  Occurrences  +  "times in the array");

        input.close();
    }


    public static int noOfOccurrences(int[] numArr, int num){

        int occ = 0;
        int i = 0;
        while(i < numArr.length){
            if(numArr[i] ==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
