// Package declaration (optional, based on your project structure)
package Exception_Handling;

// Class definition
public class with_TryCatch {

    // Main method – entry point of the program
    public static void main(String[] args) {
        int a = 10; // Declare and initialize variable 'a' with value 10
        int b = 0;  // Declare and initialize variable 'b' with value 0 (this will cause a divide-by-zero error)

        try {
            // Attempting to divide 'a' by 'b'
            // This line will throw an ArithmeticException since division by zero is not allowed in Java
            int result = a / b;
            
            // This line will not execute if the exception occurs above
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // This block will catch the ArithmeticException thrown in the try block
            // We are printing a user-friendly error message here
            System.out.println("Error: Cannot divide by zero.");
        }

        // This line runs regardless of whether an exception occurred or not
        System.out.println("Program continues...");
    }
}