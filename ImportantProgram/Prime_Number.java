package ImportantProgram;

public class Prime_Number {

	public static void main(String[] args) {
		
		int num=7;
		int i=1;
		int count = 0;
		
		while(i<=num) 
		{
			if(num%i==0) 
			{
				count++;
			}
		        i++;
		}
		if(count==2) {
		System.out.println("Prime Number");
	}
		else {
			System.out.println("Not Prime Number");
		}
}
}