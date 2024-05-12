package CollectionAndGenerices.Collecttion;

public enum TrafficLight {
    
    RED("Stop"),GREEN("Go"),YELLOW("Caution");

    private final String action;

        // constructor
    TrafficLight(String action){
        this.action = action;
    }
}
