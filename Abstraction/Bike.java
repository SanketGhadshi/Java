package Abstraction;

// Bike is a subclass of abstract class Vehicle
public class Bike extends Vehicle {

    // Constructor of Bike class
    Bike() {
        super(5);  // Calls constructor of Vehicle (superclass) with argument 5
        System.out.println("Bike():-Constructor ");
    }

    // Implementation of abstract method 'one'
    public void one() {
        System.out.println("one():-Method ");
    }

    // Implementation of abstract method 'two'
    void two() {
        System.out.println("two():-Method ");
    }

    // Static method specific to Bike class
    public static void four() {
        System.out.println("four() :-Bike Method ");
    }

    // Main method
    public static void main(String[] args) {

        // Creating object of Bike class
        Bike obj = new Bike();  // This will call Vehicle constructor and then Bike constructor

        // Calling implemented methods
        obj.one();     // Output: one():-Method
        obj.two();     // Output: two():-Method

        // Calling static methods
        three();       // Vehicle.three() – inherited static method
        four();        // Bike.four() – static method of Bike

        // Polymorphic behavior (can uncomment for demonstration)
//         Vehicle o = new Bike();  // Allowed: parent reference to child object
//         Vehicle a = new Vehicle(); //  Error: Cannot instantiate abstract class
    }
}
