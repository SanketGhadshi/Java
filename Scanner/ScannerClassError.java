package Scanner;
import java.util.Scanner;
public class ScannerClassError {

	public static void main(String[] args) {
	     
		 Scanner s=new Scanner(System.in);
	       
	       System.out.println("Enter First No :-");
	       int a=s.nextInt();

	       System.out.println("Enter Second No :-");
	       int b=s.nextInt();
	       
	       int d=a+b;
	       
	       System.out.println("Final value of d is:"+d);
	       

	}

}

