package String;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		String str=d.toString(); //
		System.out.println(str);
		
		String d2=str.replaceAll(":", "_");
		System.out.println(d2);
	}

}
