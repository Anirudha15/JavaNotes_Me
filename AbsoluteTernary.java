import java.util.Scanner;

public class AbsoluteTernary {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute Value:\n");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int result = num >=0 ? num : -num;  //ternary operator
        System.out.println("Absolute value is: " + result);


        input.close();
    }


}