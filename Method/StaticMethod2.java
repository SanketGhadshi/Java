package Method;

public class StaticMethod2 {
	
	public static void MyClass(){   //Static Method
	    System.out.println("Run");
	}

	public static void main(String[] args) { // Main Method
		
		System.out.println("Good Morning");
		
		MyClass(); //reference of static method
	}

}
