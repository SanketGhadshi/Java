package ImportantProgram;

public class Reverse_String_Pattern {

	public static void main(String[] args) {
		String s="sample";
		int a=s.length();
		
		for(int i=s.length()-1; i>=0 ;i--) 
		{
			for(int j=0;j<=i;j++) {
				char b=s.charAt(j);
				System.out.print(b);	
			}			
			System.out.println();
		}	
	}
}
