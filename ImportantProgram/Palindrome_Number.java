package ImportantProgram;
import java.util.Scanner;
public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:-");
		int no=sc.nextInt();
		int reminder;     //121=121 -palindrone No.
		int temp=no;     //547=745 - Not palindrone No.
		int sum=0;
		while(no>0)
		{
			reminder=no%10;  //1 //2  //1
			sum=(sum*10)+reminder; //1 //10+2=12  //120+1=121
			no=no/10; //12  //1
		}
	if(temp==sum)
		{
		 System.out.println(temp+" is palindrome number ");
			
		}
	else
     {
			System.out.println(temp+" is not a palindrome number");
	}	
}
}