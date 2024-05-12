package MultiThreadingAndExecutorService.Q102;

public enum TrafficColor {
    
    RED(5000),
    YELLOW(1000), 
    GREEN(30000);

    private int onTimeInMills;

    public int getonTimeMills(){
        return onTimeInMills;
    }

    TrafficColor(int onTimeInMills){
        this.onTimeInMills = onTimeInMills;
    }
}
