
/* 
99. Write a program that creates two threads. Each thread should print 
"Hello from Thread X", where X is the number of the thread (1 or 2), 
ten times, then terminate.
*/

package MultiThreadingAndExecutorService.Q99;

public class Main {
    
    public static void main(String[] args) {
        
        HelloThread t1 = new HelloThread(1);
        HelloThread t2 = new HelloThread(2);

        t1.start();
        t2.start();

        // We dont have to call run() method we have to start() instead
        // t2.run();

    }
}
