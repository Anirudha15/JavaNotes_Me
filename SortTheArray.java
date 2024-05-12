// ChecK whetherthe given array is sorted or not


public class SortTheArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sorting check point\n");
        int [] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if(isInc || isDec)
        {
            System.out.println( "The array is sorted.");
        }
        else{
            System.out.println("Array is not sorted");
        }


    }
    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;

           
        }
        return false;

        
    }


    public static boolean isIncreasing(int[] numArr){

        int i = 1;
        while(i > numArr.length){
            if(numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}



