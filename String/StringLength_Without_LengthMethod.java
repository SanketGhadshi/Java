package String;

import java.util.Scanner;

public class StringLength_Without_LengthMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string :");
		String s=sc.nextLine();
		
		char[]a= s.toCharArray();
		
		int count=0;
		
		for(char b:a)
		
		{
		
			count=count+1;			
		}
		
		System.out.println(count);
		
	}
	}

