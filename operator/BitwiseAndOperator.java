package operator;

public class BitwiseAndOperator {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean c=true;
		int d=10;
		int e=20;
		int f=30;
	System.out.println("a & b="+ (a & b)); //If one of the i/p is false then o/p is False
	System.out.println("a & c="+ (a & c)); //If both i/p is true then o/p true
	System.out.println();
	System.out.println("d<e & e<f ="+(d<e & e<f));
	System.out.println("d>e & e>f ="+(d>e & e>f));
	System.out.println("d<e & e>f ="+(d>e & e>f));
	}

}
