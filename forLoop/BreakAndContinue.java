package forLoop;

public class BreakAndContinue {
    
    public static void main(String[] args) {

        // usisng break
        System.out.println("Before loop");
        for(int i =1;i<1000;i++){
            if(i==25){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");

        //using continue  

        System.out.println("Before loop");
        for(int i = 1;i<10;i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");

    }
}
