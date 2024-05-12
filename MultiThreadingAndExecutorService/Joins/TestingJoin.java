package MultiThreadingAndExecutorService.Joins;

import MultiThreadingAndExecutorService.Runnable.PrintTask;

public class TestingJoin {
    
      public static void main(String[] args) throws InterruptedException{
        
        long startTime = System.currentTimeMillis();
        // Runnable
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        // we want this runnable around one thread
        //  we want to implement runnable and add wrapper(object of thread) thread and pass runnable in its constructor
        Thread t1 = new Thread(p1);
        t1.start();
        System.out.println("\nThread 1 Started");
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\nThread 2 Started");
        t1.join();
        // After finiesh thread 1 only thread 3 will start
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\nThread 3 Started");
        
        long endTime = System.currentTimeMillis();
        System.out.printf(" %s Total time taken: %d",
        Thread.currentThread().getName(), (endTime - startTime));

    }
}
