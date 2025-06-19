package Method;

public class StaticMethod2 {
	
	public static void myClass()
	{   //Static Method
	    System.out.println("Run");
	}
	
	public static void main(String[] args) 
	{ // Main Method
		
		System.out.println("Good Morning");
		
		myClass(); //reference of static method
	}

}
