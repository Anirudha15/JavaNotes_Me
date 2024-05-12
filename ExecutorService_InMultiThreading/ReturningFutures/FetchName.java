package ExecutorService_InMultiThreading.ReturningFutures;

import java.util.concurrent.Callable;

public class FetchName  implements Callable<String>{

    private final String name;

    
    public FetchName(String name) {
        this.name = name;
    }


    @Override
    public String call() throws Exception {

        System.out.printf("\nGeeting full name of %s from server", name);

        // this will go in server and fetech some  thing from server
        Thread.sleep(4000);
        return name + " Shinde";
    }
    
}
