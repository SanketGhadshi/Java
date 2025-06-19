package Method;

public class StaticMethod3 {

	public static void main(String[] args) 
	{
		MyClass(); //reference of static method
		
		System.out.println("Hello world");
	}
	
	public static void MyClass(){  //Static Method
		
    System.out.println("Run - MyClass() static method");
}

}