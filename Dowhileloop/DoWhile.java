package Dowhileloop;
import java.util.Scanner;

// Accept age from user

public class DoWhile {

    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Please enter your age: ");
    //     int age = input.nextInt();
    //     while(age<0 || age>100){
    //         System.out.println("Please enter your age: ");
    //         age = input.nextInt();
    //     }
    //     System.out.println("You age is : "+ age);
    //     input.close();
    // }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int age;
        do{
            System.out.println("Please enter your age: ");
            age = input.nextInt();
        } while(age < 0|| age > 100);
        System.out.println("Your age is: " + age);

        input.close();

        
    }
    
}
