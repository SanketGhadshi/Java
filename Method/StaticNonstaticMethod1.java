package Method;

public class StaticNonstaticMethod1 {
	public static void aOne() {
		System.out.println("aOne static method is running");
	}
	public static void aTwo() {
		System.out.println("aTwo static method is running");
	}
	public void aThree() {
		System.out.println("aThree Non static method is running");
	}
	public void aFour() {
		System.out.println("aFour Non static method is running");
	}

	public static void main(String[] args) {
		aOne();  //call static method (i.e aOne) in main method
		aTwo();  //call static method (i.e aTwo) in main method
		StaticNonstaticMethod1 x=new StaticNonstaticMethod1(); //create obj. of that perticular class	
		x.aThree(); //call Non static method With creating ref. variable(i.e aThree) in main method
		x.aFour();//call Non static method With creating ref. variable(i.e afour) in main method
		
	}

}