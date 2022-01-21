package Constructor;

public class Constructor3 {
	
	Constructor3(){    //Non argument constructor
		int a=2;
	   System.out.println(a);
}
	public static void main(String[] args) {
		
		new Constructor3(); //1st calling method
		//OR
		Constructor3 x=new Constructor3();  //2nd calling method
	}

}
