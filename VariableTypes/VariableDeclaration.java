package VariableTypes;

public class VariableDeclaration {
 
	static char a='A';
	static int b=2;
	static byte c;
 
	public void test() {                     // Non Static method
	 
	System.out.println(a+":-Non Static method"); 
	System.out.println(b+":-Non Static method"); 
	System.out.println(c+":-Non Static method"); 
 }
   public static void test1() {                 // Static method     
	System.out.println(a+":-Static method");
	System.out.println(b+":-Static method"); 
	System.out.println(c+":-Static method"); 
 }
	 
	public static void main(String[] args) {
	
	test1();
	VariableDeclaration x=new VariableDeclaration();
	x.test();
	
   
	}

}
