
// Create program to calculate the absolute value of integer 
import java.util.Scanner;

class AbsoluteTernary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Absolute values...");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.print(result);

        input.close();

    }

}
