package VariableTypes;

public class LocalVariable
{
    public static void test() 
    {
        int a = 1;     // Local variable: only accessible inside 'test' method
        System.out.println(a);
    }

    public void test1() 
    {
        int b = 3;     // Local variable: only accessible inside 'test1' method
        System.out.println(b);
    }

    public static void main(String[] args) 
    {
        // System.out.println(c);   'c' is not declared — this line is commented
        
        LocalVariable.test();                 // Calling static method directly using class name
        LocalVariable x = new LocalVariable();  // Creating object for non-static method
        x.test1();                            // Calling non-static method using object
    }
}
