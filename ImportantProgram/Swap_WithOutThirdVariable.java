package ImportantProgram;

public class Swap_WithOutThirdVariable {
	
	public static void main(String[] args) {
		
		int a=10,b=50;
		
		a=a+b;  //a = 10+50 =60
		
		b=a-b;  //b = 60-50 =10
		
		a=a-b;  //a = 60-10 =50
		
		System.out.println("After Swap a: "+a);
		System.out.println("After Swap b: "+b);	
	}

}
