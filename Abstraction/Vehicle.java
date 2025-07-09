package Abstraction;

// Abstract class declaration
public abstract class Vehicle {

    // Constructor of abstract class
    public Vehicle(int a) 
    {
        System.out.println("Constructor Vehicle()");
    }

    // Abstract method – must be implemented by child class
    abstract public void one();

    // Another abstract method – must be implemented by child class
    abstract void two();

    // Static method – belongs to the class, not instance
    public static void three() 
    {
        System.out.println("Vehicle three()");
    }
}
