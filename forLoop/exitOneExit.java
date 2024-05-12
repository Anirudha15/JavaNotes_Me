
// Create a program using break to read inputs from the user in a loop and break the loop id a specific keyword(like "exit") is entered

package forLoop;

import java.util.Scanner;

public class exitOneExit {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your command: ");
            String command = input.next();
            if(command.equals("exit")){
                break;
            }

        }
        input.close();
        System.out.println("You have successfuly exited. ");
    }
}
