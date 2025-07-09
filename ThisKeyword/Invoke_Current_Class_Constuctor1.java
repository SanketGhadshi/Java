package ThisKeyword;

public class Invoke_Current_Class_Constuctor1 {

    // Default constructor
    Invoke_Current_Class_Constuctor1() {
        this(1); // Call to parameterized constructor must be the first statement
        System.out.println(" Default Constructor one");
    }

    // Parameterized constructor
    Invoke_Current_Class_Constuctor1(int z) {
        System.out.println(" Parameterized Constructor one");
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        Invoke_Current_Class_Constuctor1 obj = new Invoke_Current_Class_Constuctor1();
    }
}
