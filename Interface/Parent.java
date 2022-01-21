package Interface;

public interface  Parent {
	
//	Parent() // Interface can't have constuctor

  public void test1();
  
  abstract void test0();
	
//	public static void test2(); //Error
	
	public static void t()
	{
	 System.out.println("t():-Parent class");	
	}
}
