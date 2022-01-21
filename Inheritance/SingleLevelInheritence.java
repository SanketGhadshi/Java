package Inheritance;

public class SingleLevelInheritence {

	//class B extends A
	
	public static void main(String[] args) {
		
		B.BOne();
		B.AOne();
		
		B as=new B();
		as.A();
		as.B();
	}

}
