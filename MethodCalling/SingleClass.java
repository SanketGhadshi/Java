package MethodCalling;

public class SingleClass {
	
	public void test() 
	{      // Non static method
		System.out.println (" test() Non static method in Single class");
	}
	
	public static void test3() 
	{      // Static method
		System.out.println("test3() Static method in Single class");
	}

	public static void main(String[] args) 
	{
		SingleClass z=new SingleClass();  //for calling method non static method
		         z.test();
        test3();    //calling method for Static Method
         //OR
        SingleClass.test3();//calling method for Static Method 
        z.test3(); 
	}

}
