package ForLoops;

import java.util.Scanner;

public class ForLoop_tableofAnyNo {                      // Table of any number

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		
		System.out.print("Enter Table of :");
		int t=a.nextInt();
		
	for(int b=1; b<=10 ; b++) {   //Print table of 2
			
			System.out.println(t*b);
		}
	}
}
