import java.util.Scanner;

public class simpleCalculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculatro\n");
        System.out.println("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = input.nextInt();
        System.out.println("Now enter the operator" );
        String operation = input.next();

        int result = switch (operation) {

            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;

        };

        System.out.println("Yuor Answer is: " + result);



        input.close();
    }


}
