package VariableTypes;

public class InstanceVariable {
    int c = 3;      // Instance variable (a.k.a Global variable)
    String name;    // Another instance variable

    public static void test() {
        int c = 6;  // Local variable inside static method
        System.out.println(c + ":- this is local variable in static method");

        // System.out.println(this.c);  ERROR
        // 'this' cannot be used in a static context
//      this needs an object to refer to.
//      But in a static method, no object exists, so there’s nothing for this to refer to.  
  
    }

    public void test1() {
        int c = 4;  // Local variable inside non-static method
        System.out.println(c + ":- Local variable in Non static method");

        // Now accessing instance variable 'c' using 'this'
        System.out.println(this.c + ":- Instance/Global variable in Non static method");
    }

    public static void main(String[] args) {
        InstanceVariable x = new InstanceVariable();  // Creating object of the class
        x.test1();   // Calling non-static method

        test();      // Calling static method
    }
}
