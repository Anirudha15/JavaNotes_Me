package ExecutorService_InMultiThreading.MultipleThreadExecutor;

public class PrintTask implements Runnable{
    
    @Override
    // this does not gives us result we has used void in run
    // so we use Returning Futures for this in next topic.
    public void run() {

        // Print task
        // just increase count of i up 200 for awaitTerminate"\n********2"
        for (int i = 1; i<=100; i++){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
               throw new RuntimeException(e);
            }
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
