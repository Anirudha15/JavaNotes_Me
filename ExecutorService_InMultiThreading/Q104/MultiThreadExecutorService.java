/*
104. Create a fixed thread pool with a specified number of threads 
using Executors.newFixedThreadPool(int). Submit multiple tasks 
to this executor, where each task should print the current thread's 
name and sleep for a random time between 1 and 5 seconds. 
Finally, shut down the executor and handle proper termination 
using awaitTermination.

 */
package ExecutorService_InMultiThreading.Q104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutorService {
    

    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
        
            for(int i = 0;i<10;i++){
                SleepTask task = new SleepTask();
                service.submit(task);
            }
            service.shutdown();
            if(!service.awaitTermination(10,TimeUnit.SECONDS)){
                System.out.println("Emergency Shutdown");
                service.shutdown();
            }
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    
    }
}
