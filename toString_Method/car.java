package toString_Method;
class car {

     int noOfWheels;
     int noOfDoors;
     int maxSpeed;
     String name;
     String modelNumber;
     String company;


    public car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString(){
        return"My car name is: " + name;
    }
    
    public static void main(String[] args) {
        car swift = new car(noOfWheels:4,noOfDoors:4,maxSpeed:140,name:"Swfit",modelNumber:"Sw25",company:"Maruti");
        System.out.println(swift);
    }


    
}