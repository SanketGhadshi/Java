package MethodCallingOne;

public class DifClassWithargument {

	public void test(int a) { // Non static method
		System.out.println (" Non static method in DifClassWithargument");
	}
	
	public static void test(int a,String b) {      // Static method
		
		System.out.println(" Static method in DifClassWithargument");
	}
}
