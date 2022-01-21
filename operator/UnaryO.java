package operator;

public class UnaryO {

	public static void main(String[] args) {
		
		int y=7;
		
		int x,z;
		x= ++y*8;       //1+7*8=64
		z=y--;          // print y=8 then deccremt y
	
		System.out.println(x);
		
		System.out.println(z--);  //1st print y=8 then decremt y=8-1
		System.out.println(z);    // print z=8-1=7
	}

}
