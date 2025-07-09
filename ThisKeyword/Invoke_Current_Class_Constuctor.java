package ThisKeyword;

public class Invoke_Current_Class_Constuctor {
	
	 // Default Constructor
	Invoke_Current_Class_Constuctor() {
        // this() must be the first statement in constructor if used otherwise gives error
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
	Invoke_Current_Class_Constuctor(int z) {
        this(); // Calls the default constructor first
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {
        // Creating object using parameterized constructor
        // It will internally call the default constructor because of this()
    	Invoke_Current_Class_Constuctor obj = new Invoke_Current_Class_Constuctor(3);
    }
}