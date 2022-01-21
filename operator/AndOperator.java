package operator;

public class AndOperator {  //Logical AND or Bitwise AN

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a<b && a<c);//Logical && is False when one condition is false
		System.out.println(a<b & a>c);// bitwise & is false when one condition is false
		System.out.println(a<c && b<c);//Logical && is true when both condition are true
		System.out.println(a<c & b<c);// bitwise & is True when both condition are true

	}

}
