package String;

public class Split_Method {

	public static void main(String[] args) {
		
		String str="Java,Selenium,Testng,Maven";
		
		String s[]=str.split(",");
		
		for(int i=0;i<=s.length-1 ;i++)
	    System.out.println(s[i]);	

	}

}
