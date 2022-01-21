package ImportantProgram;

public class Factorial {
	
	public static void main(String[] args) {
		
		int no=5;
		int fact=1;
		
		for(int i=1;i<=no;i++) {
			
			fact=fact*i;  // (1*1) /1*2 /2*3=6 /6*4=24 /24*5=120
		}
		System.out.println("Factorial is:- "+fact);
	}

}
