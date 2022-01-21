package ImportantProgram;

public class Palidrome_Sting {

	public static void main(String[] args) {
		String name="Nitin"; 
		String m="";
	for(int i=name.length()-1; i>=0; i--) {
		
		 m=m+name.charAt(i);
		 
	}
		if(name.equals(m)) {
		System.out.print(m+" is Palidrome String");
	}
	else {
		System.out.print(m+" is NOT Palidrome String");
	}   
   }
 }