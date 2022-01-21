package MethodOverriding;

public class B extends A { //B class have all data of A clss

	public void test() {
		super.test();     //refernce of parent class method
	System.out.println("500"); 
	}
	void test2(int a) {
		super.test2(4);
		System.out.println ("B class test2(int a)");
		}
	// We can not override static methods
	static void test1()
	{
	//	super.test1();  //can't use reference of static method of parent class
	System.out.println ("B class test1()");	
	}
	
public static void main(String[] args) {
	    test1();
	    A.test1();
		B o=new B(); //only sub class(B) method only show, Not show super class(A) method
		o.test(); 
		o.test2(9);

    }
}