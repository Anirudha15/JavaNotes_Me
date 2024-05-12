

// Create a base class Vechile with methods service() and a subclass Car that overrides service(). In Car's service(),
// provides a specifice implementation that calls super.service() as well to shoe how override works.

package Polymorphism.Q86;

public class Vehicle {
    
    public void service(){
        System.out.println("Vechile is getting serviced.....");
    }
}
