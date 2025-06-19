package String;

public class Reverse_Words_in_String {

	public static void main(String[] args) {
		
		String S = "I am learning Java" ;
		String a[] = S.split(" ") ;
		String rev = "";
		
		for(int i=a.length-1;i>=0;i--) 
		{	
			rev = rev + a[i]+" ";
		}
		System.out.println(rev);
	}
}
