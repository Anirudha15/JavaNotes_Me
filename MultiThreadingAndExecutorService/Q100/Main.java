




package MultiThreadingAndExecutorService.Q100;

public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        ThreadState t1 = new ThreadState();

        System.out.printf("\nCreated the thread %s", t1.getState());
        t1.start();

        // Throws interrupted exception
        t1.join();

        // this step when thread is finished
        System.out.printf("\nThread finisehed %s", t1.getState());
    }
}
