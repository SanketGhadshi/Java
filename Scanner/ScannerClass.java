package Scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       
       System.out.println("Enter First No :-");
       int a=s.nextInt();

       System.out.println("Enter Second No :-");
       int b=s.nextInt();
       
       System.out.println("Enter Third No :-");
       int c=s.nextInt();
       
       int d=a+b+c;
       
       System.out.println("Final value of d is:-"+d);
       
	}

}
