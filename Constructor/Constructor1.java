package Constructor;

public class Constructor1 {
	
	Constructor1()  //Non argument constructor
	{          
	  System.out.println("This is Non argument");
}
	public static void main(String[] args) {
		
		new Constructor1();  //1st calling method
		//OR
		Constructor1 x=new Constructor1();  //2nd calling method
	}

}
