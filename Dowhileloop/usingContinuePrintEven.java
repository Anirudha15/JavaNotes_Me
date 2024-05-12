
// Create a program sunig continue to print on;y even numbers using for odd numbers

package Dowhileloop;

public class usingContinuePrintEven {
    
    public static void main(String[] args) {
        
        for(int i =1;i<=100;i++){

            if(i % 2 ==1){
                continue;
            }
            System.out.println("The number is : "+i);
        }

    }

}
