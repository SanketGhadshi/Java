package VariableTypes;

public class InstanceVariable {
	int c=3;   //Global or instance variable declare in class body(static method can't access)
	String name;
	public static void test() {
		int c=6;         //Static method body,Global var. not access in this method
		System.out.println(c+":- this is local variable in static method");
//		System.out.println(this.c); // showing error 
	}
	public void test1() {
		int c=4;        //Non Static method body
		System.out.println(c+":-Local variable in Non static method " );
		System.out.println(this.c+ ":-Instance/Global variable in Non static method");
	}
	public static void main(String[] args) {
				 
		InstanceVariable x=new InstanceVariable();
		x.test1();
		
		test();	
	}
}