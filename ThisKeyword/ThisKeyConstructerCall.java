package ThisKeyword;

public class ThisKeyConstructerCall {
	
	public ThisKeyConstructerCall()
	{
		this(5);  //constructor chaining rule, within constructor call only one const,
		          //this only a first statement of the method
		System.out.println("First");
	}
	public ThisKeyConstructerCall(int a)
	{
		this(5,5);
		System.out.println("Second");
	}
	public ThisKeyConstructerCall(int b,int c)
	{
		System.out.println("Third");
	}
	public static void main(String[] args) {
		
		ThisKeyConstructerCall x=new ThisKeyConstructerCall();


	}

}
