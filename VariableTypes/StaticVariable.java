package VariableTypes;

public class StaticVariable {
 static char e='A';
 static int a=2;
 
	public static void main(String[] args) {
		test();
		StaticVariable x=new StaticVariable();
		x.test1();

	}
	public void test1() {
		System.out.println(e+":-Local variable in Non static method " );
		System.out.println(a+ ":-Instance variable in Non static method");
	}
	public static void test() {
		
		System.out.println(e+":-variable in static method ");
	}
}
