package Polymorphism;

public class Overloading {

    // constructor
    Overloading(){
        System.out.println("Default constructor called.");

    }

    Overloading(String pop){
        System.out.println(pop);
    }

    // Method Overloading
    public int add(int a,int b){
        return a+b;
    }

    public String add(String a,String b){
        return a.concat(b);
    }

    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
        // Another way to solve
    // public int sumNumbers(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }
    public static void main(String[] args) {
        Overloading overloading =new Overloading();
        System.out.println(overloading.add(4, 5));
        System.out.println(overloading.add(9, 5, 1, 3));
        System.out.println(overloading.add("Anirudha",  " Shinde"));
    }

    
}
