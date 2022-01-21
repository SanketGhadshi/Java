package operator;

public class AndOperator1 {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean c=true;
		
	System.out.println("a && b="+ (a && b)); //If one of the i/p is false then o/p is False
	System.out.println("a && c="+ (a && c)); //If both i/p is true then o/p true
	System.out.println("a & b="+ (a & b)); //If one of the i/p is false then o/p is False
	System.out.println("a & c="+ (a & c)); //If both i/p is true then o/p true
	
	}
}
