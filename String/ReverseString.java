package String;

public class ReverseString {

	public static void main(String[] args) {
		String name="SanketGhadshi";
		String reversedString ="";
		int count=0;
		
		for(int i=name.length()-1;i>=0;i--) {
			reversedString=reversedString + name.charAt(i);
			count++;
		}
		System.out.print("The reversed string of the "+name+" is :");
		System.out.println(reversedString);
		System.out.println("Total no. of character in string:"+count);
	}

}
