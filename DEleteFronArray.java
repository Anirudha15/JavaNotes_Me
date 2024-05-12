import java.util.Scanner;

public class DEleteFronArray {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcone to Array Deletion");
    int[] numArr = ArrayUtility.inputArray();
    System.out.println("Now Enter the number you want to delete");
    int numToDelete = input.nextInt();
    int[] newArr = deleteNumber(numArr);
    System.out.println("Here is your new array");
    ArrayUtility.displayArray(newArr);
 }

    public static int[] deleteNumber(int[] numArr void numToDelete()){
    Object occurencesArray;
    Object numArr;
    int occ = ((Object) occurencesArray).noofOccurances(numArr,numToDelete());
    if(occ== 0){
        return;
     }
    Object[] newArr;
    int newsize = newArr.length - occ;
    int [] newNumArr = new int[newsize];

    int i = 0,j=0;
    while(i < numArr.length;i++){
        if(numArr[i] != numToDelete()){
             newArr[j] = numArr[i];
            j++;
           }
        return ;
      }
    
 
  }
} 