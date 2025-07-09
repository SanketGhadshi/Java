package ImportantProgram;

public class Palidrome_Sting {

	public static void main(String[] args) {
	
		String name="RAR"; 
		String str="";
	for(int i=name.length()-1; i>=0; i--) {
		
		 str= str + name.charAt(i);
		 
	}
		if(name.equals(str)) {
		System.out.print(str+" is Palidrome String");
	}
	else {
		System.out.print(str+" is NOT Palidrome String");
	}   
   }
 }