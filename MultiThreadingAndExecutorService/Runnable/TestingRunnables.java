package MultiThreadingAndExecutorService.Runnable;

public class TestingRunnables {
    
    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();
        // Runnable
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        // we want this runnable around one thread
        //  we want to implement runnable and add wrapper(object of thread) thread and pass runnable in its constructor
        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();
        
        long endTime = System.currentTimeMillis();
        System.out.printf(" %s Total time taken: %d",
        Thread.currentThread().getName(), (endTime - startTime));

    }
}
