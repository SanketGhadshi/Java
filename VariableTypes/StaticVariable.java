package VariableTypes;

public class StaticVariable {

    static char e = 'A';  // static variable
    static int a = 2;     // static variable

    public static void main(String[] args) {
        
    	test();  // calling static method directly

        StaticVariable x = new StaticVariable(); // creating object
        x.test1();  // calling non-static method using object
    }

    public void test1() {
        System.out.println(e + ":- Static variable in Non static method");
        System.out.println(a + ":- Static variable in Non static method");
    }

    public static void test() {
        System.out.println(e + ":- Static variable in static method");
    }
}
