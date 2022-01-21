package String;

public class RemoveChar {

	public static void main(String[] args) {
		
		String inputString="Sanket Ghadshi";
		char ch='a';
		
		String result=removeCharacters(inputString,ch); //pass inputString & char you want to remove
		
		System.out.println("After character removing "+ch+" from the inputString "+inputString+
				 " the result will be:\n" +result);
	}             //a method to remove any particular char from the string
	
	public static String removeCharacters(String str,char ch)
	{
		String result=str.replace("a","");
		return result;
	}
}
