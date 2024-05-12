
/* 
101. Create three threads. Ensure that the second thread starts only after 
the first thread ends and the third thread starts only after the second 
thread ends using the join method. Each thread should print its start 
and end along with its name
*/


package MultiThreadingAndExecutorService.Q101;


public class TestingJoin {
    
    public static void main(String[] args) throws InterruptedException{
        
    
    PrintThread t1 = new PrintThread(1);
    PrintThread t2 = new PrintThread(2);
    PrintThread t3 = new PrintThread(3);

    t1.start();
    // used to start particular thread
    t1.join();
    t2.start();
    t2.join();
    t3.start();
    }
}
