package Method;

public class StaticMethod4 
  { 
	public static int add(int a, int b) 
	{    
	return a + b;
    }

	public class Main {
	    public static void main(String[] args) 
	    {
	        int sum = StaticMethod4.add(5, 3);  // Static method call using class name
	       
	        System.out.println("Sum: " + sum);
	    }
	}
}
