package MultiThreadingAndExecutorService.Runnable;

public class PrintTask implements Runnable{
    
    @Override
    public void run() {

        // Print task
        // just increase i value upto 200 
        for (int i = 1; i<=20; i++){
            System.out.printf("%d%c ",i,targetChar);
        }
        System.out.printf("\n%s %c task complete",
        Thread.currentThread().getName(),targetChar);
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }

    
}
