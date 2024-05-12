
// 73 Simulate a dice roll using Math.random() and display the outcomes(1 to 6).

package toString_Method;

public class diceRoll {
    
    int roll(){
        double random = Math.random() * 6;
        return (int) Math.ceil(random);
    }


    public static void main(String[] args) {

         diceRoll Dice = new diceRoll();
         for(int i =0;i< 10;i++){
            System.out.println(Dice.roll());
         }
        
    }
}
