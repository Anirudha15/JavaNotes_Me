package MultiThreadingAndExecutorService.ThreadCommincation.Sleep;

public class TestingSleep {
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Before sleeping");

        // Thread is a static method this is called by main thread
        Thread.sleep(5000);
        System.out.println("Woke up");
    }
}
