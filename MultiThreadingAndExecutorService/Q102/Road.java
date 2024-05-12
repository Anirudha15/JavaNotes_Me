

/* 
102. Simulate a traffic signal using threads. Create three threads 
representing three signals: RED, YELLOW, and GREEN. Each signal 
should be on for a certain time, then switch to the next signal in order. 
Use sleep for timing and synchronize to make sure only one signal is 
active at a time
*/

package MultiThreadingAndExecutorService.Q102;

// Main class for testing traffic light
public class Road {
    
    public static void main(String[] args) throws InterruptedException{
        
        TrafficLightThread red = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread yellow = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread green = new TrafficLightThread(TrafficColor.GREEN);
        
        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
        // no need to start red light
        // red.join();
       

    }
}
