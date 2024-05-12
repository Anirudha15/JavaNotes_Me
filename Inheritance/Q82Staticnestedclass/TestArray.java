package Inheritance.Q82Staticnestedclass;

public class TestArray {
    
   
    public static void main(String[] args) {
        ArrayOperation opr = new ArrayOperation(new int[]{1,3,2,5,6,4});
        ArrayOperation.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    
    }   

}
