package String;

public class String1 {

	public static void main(String[] args) {
		String a="Sanket";   //Stored in string constat pool
		String b="Sanket";   //with two variable a & b refer same object not create seperate two objects
		
		System.out.println(a==b);

		String c=new String("Sanket");  //Stored inside Heap 
		String d=new String("Sanket");  //Here create two seperate objects for c & d
		
		System.out.println(c==d);
	}

}
