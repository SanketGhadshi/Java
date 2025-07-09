package ImportantProgram;

import java.util.Scanner;

public class SpaceCount_fromString {

	public static void main(String[] args) {
		
	     Scanner s=new Scanner(System.in)	;
	     System.out.println("Enter String :");
	         String sen=s.nextLine();

	         
	        int count=0;

	        for(int i=0 ;i<sen.length() ; i++) {
		
	        	char a=' ';
		
		if(a==sen.charAt(i)) {
			count++;
		}	
	}
	System.out.println("No of spaces :"+count);
		}

	}
	

