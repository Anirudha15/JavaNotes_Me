
/*
03. Write a program that creates a single-threaded executor service. 
Define and submit a simple Runnable task that prints numbers 
from 1 to 10. After submission, shut down the executor.
 */

package ExecutorService_InMultiThreading.Q103;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShingleThreadService {
   
   public static void main(String[] args) {
    
   
        try(ExecutorService service = Executors.newSingleThreadExecutor()){
            PrintNumbers task = new PrintNumbers();
            service.submit(task);
        }
    } 
}
