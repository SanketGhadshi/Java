package Interface;

public class ChildClass implements  Parent {
	
	public void test0()
	{
		System.out.println("test0()");	
	}
	public void test1()
	{
		System.out.println("test1()");
	}
	public void test2()
	{
		System.out.println("test2()");
	}

	public static void main(String[] args) {
		
		ChildClass obj=new ChildClass();
		obj.test0();
		obj.test1();
		
	//	Parent.class();
		
		
	//   t();  //Error show required declared with Parent.t();

	}

}
