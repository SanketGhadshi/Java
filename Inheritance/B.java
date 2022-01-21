package Inheritance;

public class B extends A {
	
	public void B() {
		System.out.println("B class");
	}
	public static void BOne() {
		System.out.println("B-One:- B class");
	}
	public static void main(String[] args) {
		
		  BOne();
		  AOne();
		
		B obj=new B();
		obj.A();
		obj.B();
	}

}

