package ForLoops;

import java.util.Scanner;

public class ForLoop3 {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		
		System.out.print(" Find out Even & Odd No. From 0 to ");
		int c=x.nextInt();
		
		for(int b=0; b<=c ; b++) {   //Print Even & Odd Number
			if(b % 2==0) {
				System.out.println(b+":-Even Number");
			}
			else {
				System.out.println(b+":-Odd Number");
			}
		}
	}

}
