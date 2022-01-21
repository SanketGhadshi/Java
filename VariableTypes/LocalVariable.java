package VariableTypes;

public class LocalVariable{
	public static void test() {
		int a=1;     //Local variable only within method body
		System.out.println(a);
	}
	public void test1() {
		int b=3;  //Local variable only within method body
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		//System.out.println(c);
		
		LocalVariable.test();	 // calling of static method	
		LocalVariable x=new LocalVariable();   // calling of Non static method	
		x.test1();
	}
	
}