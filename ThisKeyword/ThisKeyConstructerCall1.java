package ThisKeyword;

public class ThisKeyConstructerCall1 {
	
	ThisKeyConstructerCall1()
	{
		this(5);
		System.out.println("Run 1st constructor");
	}
	
	ThisKeyConstructerCall1(int a)
	{
		this("Sanki");
		System.out.println("Run 2nd constructor");
	}
	ThisKeyConstructerCall1(String a)
	{
		
		System.out.println("Run 3rd constructor");
	}
	

	public static void main(String[] args) {
		
		ThisKeyConstructerCall1 ab=new ThisKeyConstructerCall1();

	}

}
