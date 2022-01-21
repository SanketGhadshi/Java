package operator;

public class LogicalaAndOperator {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean f=true;
		
		int c=10;
		int d=20;
		int e=30;
		
	System.out.println("a && b="+ (a && b)); //If one of the i/p is false then o/p is False
	System.out.println("True && True ="+ (c<d && d<e)); //If both i/p is true then o/p true
	System.out.println("False && True ="+(c>e && e>d)); //If one of the i/p is false then o/p is False
	System.out.println("a && f="+ (a & f)); //If both i/p is true then o/p true
	
	}
}
