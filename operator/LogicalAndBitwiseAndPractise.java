package operator;

public class LogicalAndBitwiseAndPractise {

	public static void main(String[] args) {
	
		int a=10;
		int b=5;
		int c=20;
		
		System.out.println((a<b) && (a++<c)); //false && true = false
		System.out.println(a); /*a=10 print bcoz in logical && 1st condition false then 
		2nd condition not checked.if 1st con. true checked 2nd then a=11 bcoz a++ */
		
		System.out.println((a<b) & (a++<c)); //false && true = false
		System.out.println(a);/* in bitwise & both condition cheched so print a value is
		   a++ = 11 */
	}

}
