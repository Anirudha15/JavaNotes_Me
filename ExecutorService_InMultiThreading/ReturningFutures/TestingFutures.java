package ExecutorService_InMultiThreading.ReturningFutures;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class TestingFutures {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = Executors.newFixedThreadPool(1);
        FetchName task1 = new FetchName("Anirudha");
        FetchName task2 = new FetchName("Anushka");
        FetchName task3 = new FetchName("Aniket");
        
        // Silimar as promises in javascript
       Future<String> name1 = service.submit(task1);
       Future<String> name2 = service.submit(task2);
       Future<String> name3 = service.submit(task3);

        System.out.printf("\nFull Name is: %s", name1.get());
        System.out.printf("\nFull Name is: %s", name2.get());
        System.out.printf("\nFull Name is: %s", name3.get());
    
        service.shutdown();
    }    
}
