package MethodCallingOne;

public class SingleClassArgm {
	int c=10;
	String b="sai";
	
	public void test(int a) { // Non static method
		System.out.println (" Non static method in SingleClassArgm");
		System.out.println (a);
		System.out.println (c);
		System.out.println (b);
	}
	
	public static void test(int a,String b) {      // Static method
		
		System.out.println(" Static method in SingleClassArgm");
		System.out.println (a);
		System.out.println (b);
	}

	public static void main(String[] args) {
	
		test(5,"krish");
		
		SingleClassArgm s=new SingleClassArgm(); 
           s.test(3);
	}

}
