//  Create a program to find the maximum and minimum element in an array

public class MaxandMinArray {
    public static void main(String[] args) {
        System.out.println("Wekcome to Max and Min\n");
        int[] numArr = ArrayUtility.inputArray();
        //variable  method  
         int max = max(numArr);
        int min = min(numArr);
        System.out.println("Maximum Element is: " + max);
        System.out.println("Minimum Element is: " + min);

    }

    public static int max(int[] numArr){
        if(numArr.length == 0){
            return Integer.MAX_VALUE;
        }
        int  max = numArr[0];
        int i = 1;
        while (i < numArr.length){
        if(max< numArr[i]) {
            max = numArr[i];
        }
        i++;
    }

        return max;
    }

    public static int min(int[] numArr){


        return 0;
    }
}
