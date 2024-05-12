



package MultiThreadingAndExecutorService.Q102;

public class TrafficLightThread extends Thread{

    private TrafficColor color;
    
    public TrafficLightThread(TrafficColor color){
        this.color = color;
    }
    
    @Override
    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getonTimeMills());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n", color);
    }
}
