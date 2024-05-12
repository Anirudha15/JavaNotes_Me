
import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wlcome to finding minimm\n");
        System.out.println("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number");
        int num2 = input.nextInt();
        minimum ternary = new minimum();
        int min = ternary.min(num1, num2);
        System.out.println("Mninmum number is " + min);

        input.close();

    }

    public int min(int num1, int num2) {

        return num1 < num2 ? num1 : num2;

        // if (num1 < num2){
        // return num1;
        // }
        // else{
        // return num2;
        // }

    }
}
