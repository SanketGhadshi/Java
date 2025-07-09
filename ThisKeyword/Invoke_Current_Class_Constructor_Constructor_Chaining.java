// one constructor can call another constructor in the same class using the this() keyword. 
//This is known as constructor chaining.

package ThisKeyword;

public class Invoke_Current_Class_Constructor_Constructor_Chaining {
    
    // Instance variables
    String name;
    int age;

    // Default constructor (no parameters)
    public Invoke_Current_Class_Constructor_Constructor_Chaining() {
        // Calls the parameterized constructor
        this("Unknown", 0);
    }

    // Parameterized constructor
    public Invoke_Current_Class_Constructor_Constructor_Chaining(String name, int age) {
        // Assigns the parameter values to instance variables
        this.name = name;
        this.age = age;
    }

    // Method to display the object's state
    public void showDetails() {
        System.out.println(name + " is " + age + " years old.");
    }

    // Main method - execution starts here
    public static void main(String[] args) {
        
        // Create object using default constructor
        Invoke_Current_Class_Constructor_Constructor_Chaining s = 
                new Invoke_Current_Class_Constructor_Constructor_Chaining();

        // Call method to print details
        s.showDetails(); // Output: Unknown is 0 years old.
    }
}
