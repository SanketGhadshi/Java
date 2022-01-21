package String;

public class String_Mehods {

	public static void main(String[] args) {
		String name="harry";                     //Strings are immutable,return copy of origanal
	//	String b=new String(original:"Harry");
		
     System.out.println(name);
       
     System.out.println("1.Length of string:- "+name.length()); //find length of string 
     
     System.out.println("2.Charater at mention index string:- "+name.charAt(4));//give character at index 4(y)
     char c='h';
     System.out.println("3.Removed perticular Charater:- "+removeCharacters(name,c));
     
     String b="haRry";
     System.out.println("4.string.equals(string2):- "+name.equals(b));  //Compare two string & if same then o/p  is true vice versa, upper & lower case required same
     System.out.println("string.equalsIgnoreCase(string2):- "+name.equalsIgnoreCase(b));// uper & lower case not mater
     
     System.out.println("Substring string:- "+name.substring(1));//string start from index 1 i.e (a)
     System.out.println("Substring string:- "+name.substring(2,5));//start from r & end to y
     
     String LwString=name.toLowerCase();   //convert string upper case charters into lower case
     System.out.println("Lower case of string:- "+LwString);  //  A ---> a
     
     String UpString=name.toUpperCase();   //convert string lower case charters into upper case 
     System.out.println("Upper case of string:- "+UpString);  //  a ---> A
     
     System.out.println("Replace character string:- "+name.replace('r', 'p')); // replace 'r' in string to 'p'
     System.out.println("Replace string in string:- "+name.replace("rry", "ppy")); // replace 'rry' in string to 'ppy'
     
     System.out.println("Checked start string:- "+name.startsWith("ha")); // checked & if correct then return true otherwise false
     System.out.println("Checked end string:- "+name.endsWith("ry")); //checked & if correct then return true otherwise false
     
     String NonTrimString="   Harry   ";  
     System.out.println("NonTrimString string:- "+NonTrimString); 
     
     String TrimString=NonTrimString.trim();   // Removed space before string & Atfter string 
     System.out.println("TrimString string:- "+TrimString); 
     
	}

	private static String removeCharacters(String name, char c) {
		// TODO Auto-generated method stub
		return null;
	}

}
