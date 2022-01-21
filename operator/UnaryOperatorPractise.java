package operator;

public class UnaryOperatorPractise {

	public static void main(String[] args) {
		int a=100;
		int b=179;
		
		System.out.println(a++ + a++);//100(a++=101)+101(a++=102)=201
		System.out.println("a++ + a++ ="+(a++ + a++));//102(a++=103)+103(a++=104)=205
		
		System.out.println(a++ + ++a);//104(a++=105)+(++a=106)106=210
		System.out.println("a++ + ++a ="+(a++ + ++a));//106(a++=107)+(++a=108)108=214
		
		System.out.println(b++ + b++);//179(b++=180)+180(b++=181)=359
		System.out.println("b++ + b++ ="+ (b++ + b++));//181(b++=182)+182(b++=183)=363
	
		System.out.println(b++ + ++b);//183(b++=184) + (++b=185)185=368
		System.out.println("b++ + ++b ="+(b++ + ++b));//185(b++=186)+(++b=187)187=372
		
		System.out.println(a++ + b++);//108(a++=109) + 187(b++=188)=295
		System.out.println("a++ + b++ ="+(a++ + b++));//109(a++=110) + 188(b++=189)=297
		
		System.out.println(++a + ++b);//(++a=111)111 + (++b=190)=301
		System.out.println("++a + ++b ="+(++a + ++b)); //(++a=112)112 + (++b=191)191=303
	}

}