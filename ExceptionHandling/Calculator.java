package ExceptionHandling;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.println("Please enter your two number: ");
        int first = input.nextInt();
        int second = input.nextInt();

        try{
            int [] a = new int[5];
            // this shows exception error and cstch block does not catch this.
            // System.out.printf("Result is %d",a[6]);
            a[6] = first/second;
        //  int result = first/second;
         System.out.printf("Result is %d",a[6]);
         input.close();
        }catch(ArithmeticException exception){
            // System.out.println("Divide by zero, enter valid values");

            // when we get exception then this message is showed without showing error
            System.out.printf("%s, enter valid values", exception.getMessage());
        }
        // Above line 18 exception is handled in this catch block
        // catch(ArrayIndexOutOfBoundsException exc){
        //     System.out.println("Array is out of bound.");
        // }
        // line no 16 will throw this error directly but now it is commented by me
        catch(Throwable th){
            System.out.println("General Exception.");
            throw th;
            // rethrow in above line
         }
        //  this will run every time with oabve code
         finally{
            System.out.println("I am in finally");
         }
    }

    // private static void a(){

    // }

}

