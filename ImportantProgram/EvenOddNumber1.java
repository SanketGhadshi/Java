package ImportantProgram;
import java.util.Scanner;
public class EvenOddNumber1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number from:-");
		int a=s.nextInt();
		
		System.out.println("Enter Number upto:-");
		int b=s.nextInt();
		System.out.println("Following Even & Odd number between "+a+" to "+b);
		
		for(int i=a; a<=b ;a++) {
			if(a%2==0) {
				System.out.println(a+":-EVEN number");
			}else
			{
				System.out.println(a+":-ODD number");	
			}
		}
		
	}

}
