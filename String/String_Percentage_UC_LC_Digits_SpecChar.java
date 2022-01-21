package String;

public class String_Percentage_UC_LC_Digits_SpecChar {
	
	public static void getCharPercentage(String str) {
		int length=str.length();
		
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int specChar=0;
		int digits=0;
		
		for(int i=0; i<length; i++) {
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch)){
				upperCaseCount++;
			}
			else if(Character.isLowerCase(ch)){
				lowerCaseCount++;
			}
			else if(Character.isDigit(ch)){
				digits++;
			}
			else{
				specChar++;
			}
		}
		double upperCasePercentage=(upperCaseCount * 100.0)/length;
		double lowerCasePercentage=(lowerCaseCount * 100.0)/length;
		double digitsPercentage=(digits * 100.0)/length;
		double specCharPercentage=(specChar * 100.0)/length;
		
		System.out.println("In the given String: "+ str);
		
		System.out.println("Upper Case Count : "+ upperCaseCount);
		System.out.println("Upper Case % : "+ upperCasePercentage);
		
		System.out.println("Lower Case Count : "+ lowerCaseCount);
		System.out.println("Lower Case % : "+ lowerCasePercentage);
		
		System.out.println("digits Count : "+ digits);
		System.out.println("digits % : "+ digitsPercentage);
		
		System.out.println("Special char Count : "+ specChar);
		System.out.println("SpecChar % : "+ specCharPercentage);
	}
	public static void main(String[] args) {
		getCharPercentage("Sanket Ghadshi"); 

	}

}
