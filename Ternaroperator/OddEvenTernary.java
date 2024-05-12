import java.util.Scanner;

/**
 * OddEvenTernary
 */
public class OddEvenTernary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd or even \n");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "even" : "odd";
        System.out.println(" Your number is " + result);
        

        input.close();
    }
}