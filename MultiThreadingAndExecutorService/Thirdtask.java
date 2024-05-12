package MultiThreadingAndExecutorService;

public class Thirdtask extends Thread{
    
    @Override
    public void run() {
        for (int i = 1; i<=20; i++){
            System.out.printf("%d! ",i);
        }
        System.out.printf("\n%s ! task complete",Thread.currentThread().getName());    
    }
}
