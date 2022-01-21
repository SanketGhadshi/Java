package If_IfElse_IfElseif;

import java.util.Scanner;

public class Nested_IfElsePrac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter student marks:- ");
		int stud_Mark=sc.nextInt();
		
		if(stud_Mark>=35) 
		{
			if(stud_Mark>=60) {
				System.out.println("  First Class  ");
			}
			else {
				System.out.println("  pass  ");
			}
		}
		else {
			System.out.println("  Fail  ");
		}

	}

}
