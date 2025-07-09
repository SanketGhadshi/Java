package MethodCalling;

public class SingleClassArgument {
	
	public void one(boolean a,int b) 
	{     // Non static method overloading ---same one()
		System.out.println ("one() Non static method in SingleClassArgument class");
	}
	
	public void one(int a) 
	{  // Non static method overloading ---same one()
		System.out.println("one(int a)Non static method in SingleClassArgument class");
	} 
	
	public static void two() 
	{  //static method overloading ---same one()
		System.out.println("two() static method in SingleClassArgument");
	}
	
	public static void two(String s) 
	{  //static method overloading ---same one()
		System.out.println("two(String s) static method in Single class");
	}
	
	public static void main(String[] args) 
	{
		SingleClassArgument z=new SingleClassArgument();  //for calling method non static method
		z.one(true,7);
        z.one(2);    //calling method for non Static Method
         //OR
        two();  //calling method for Static Method 
        two("sanket");  //calling method for Static Method 
        
	}

}
