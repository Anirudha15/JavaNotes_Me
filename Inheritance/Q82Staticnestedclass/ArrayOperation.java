// Create a class Arrayoperation witha static nested class Statistics.Statistics could have methodds like mean(),medain(),which operate on array.


package Inheritance.Q82Staticnestedclass;



public class ArrayOperation {
    
    private int[] numbers;

    // Constructor
    public ArrayOperation(int[] numbers){
        this.numbers = numbers;
    }
    
    // Nested class
    public  class Statistics{

        double mean(){
            double sum = 0;
            for(int number : numbers){
               sum += number; 
            }
            return sum/numbers.length;
        }



        double median(){
            return 0;
        }
    }
}
