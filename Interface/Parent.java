package Interface;

public interface  Parent {
	
// Interface can't have constuctor	
//	Parent() 
	
  public void test1();
  
  abstract void test0();
	
//	public static void test2(); //Error
	
	public static void t()
	{
	 System.out.println(" Method Name: t() is in Parent class");	
	}
}
