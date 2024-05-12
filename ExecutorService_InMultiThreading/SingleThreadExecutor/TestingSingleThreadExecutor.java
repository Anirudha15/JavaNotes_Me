package ExecutorService_InMultiThreading.SingleThreadExecutor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import MultiThreadingAndExecutorService.Runnable.PrintTask;

public class TestingSingleThreadExecutor {
    
    public static void main(String[] args) {
        
        // we have used single thread only so it will user on;y 1 thread to complete task.
        ExecutorService service = Executors.newSingleThreadExecutor();

        // PrintTask is used from MultiThreading.Runnable folder so remember that asap
        PrintTask task1 = new PrintTask('*');
        PrintTask task2 = new PrintTask('$');
        PrintTask task3 = new PrintTask('&');
        // service.submit(task1);

        // submiting same runnable abject again and again
        // service.submit(task1);
        // service.submit(task1);

        // uing different objects from printTask class
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}
