package ImportantProgram;
import java.util.Scanner;
public class EvenOddNumbers {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);

	System.out.println("Enter Number :-");
	int a=s.nextInt();
	
	if(a%2==0) {
		System.out.println("Enter Number is 'EVEN' number ");
	}else
	{
		System.out.println("Enter Number is 'ODD' number ");
	}
	
    }
}
