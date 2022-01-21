package operator;

public class LeftshiftOpt {

	public static void main(String[] args) {
		int e=9;
		// Here in multiplication 2 is common
		System.out.println(e<<2);   //o/p=36--e=9, 9*2=18 again 18*2=36 (2 times multiplication) 
		System.out.println(10<<3);  //o/p=80--10*2=20,20*2=40,40*2=80 (3 times multiplication)
		System.out.println(20<<2);  //o/p=80---20*2=40,40*2=80 (2 times multiplication)
		System.out.println(15<<4);  /*o/p=240--15*2=30,30*2=60,60*2=120,120*2=240
                                    (4 times multiplication)*/
	}

}
