package operator;

public class UnaryOp {

	public static void main(String[] args) {
		int r=10;
		
		System.out.println(r++);  // Postfix Incremet -- 1st print r=10 then r=10+1=11
		 System.out.println(r);
		System.out.println(++r);  // Prefix Incremet -- 1+r=1+11=12
		System.out.println(r);
		System.out.println(--r);  // prefix Decrement -- 1-r=1-12=11
		System.out.println(r--);  // Postfix Decrement -- 1st print r=11 then r-1=11-1=10
		System.out.println(r);
	}

}
