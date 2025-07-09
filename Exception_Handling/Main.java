package Exception_Handling;

// Main class to demonstrate custom and built-in exception handling
public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 0; // b is 0 to simulate divide-by-zero case if needed

        try {
            // Example 1: Divide by zero
//             divide(a, b); // Uncomment this line to test ArithmeticException

            // Example 2: Manually throwing a generic exception
//             throw new Exception("Just for fun"); // Uncomment to test general exception

            // Example 3: Throwing a custom exception
            String name = "Sanket";
            throw new MyException("name is Sanket"); // Manually throwing MyException

        } catch (MyException e) {
            // Catch block for custom MyException
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            // Catch block for division by zero or other arithmetic issues
            System.out.println(e.getMessage());

        } catch (Exception e) {
            // General catch block for all other exceptions
            // NOTE: This should always be the last catch block
            System.out.println("Normal Exception");
        }

        finally {
            // Finally block always executes, regardless of exception
            System.out.println("Finally will always execute");
        }
    }

    // Method to divide two numbers and throw ArithmeticException if division by zero
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // Custom error message for division by zero
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b; // Return result if valid
    }
}
