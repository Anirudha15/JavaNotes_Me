
//74 Create a Number guessing game where the  program selects a random number and the user has to guess it 


package toString_Method;

import java.util.Scanner;



class GussingGame {
    
    int random;
    public GussingGame(){
        random = (int) Math.ceil(Math.random() * 100);
        System.out.println(random);
    }


    /**
     * 
     * @param guessNumber the number that player guess
     * @return
     * - Negative if the guessed number is smaller
     * -0 if the guess number is correct
     * - Positive if the guessed number is higher
     */

    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GussingGame game = new GussingGame();
        System.out.println("Welcome to the guessing game. Guess the number between 1-100");
        int result;
        int guess;
        do{
            System.out.println("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if(result==0){
                System.out.println("Congrate your guess is correct");
            }else if(result<0){
                System.out.println("Please guess higher");

            }else{
                System.out.println("please Guess lower");
            }
        }while(result !=0);
        input.close();
        
    }
}
