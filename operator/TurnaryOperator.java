package operator;

public class TurnaryOperator {

	public static void main(String[] args) {
		
		int a=15;
		int b=-10;
		boolean c=true;
		boolean d=false;
		
		System.out.println(~a);//-16(minus of total positive value which start from 0)
		System.out.println(~b);//9 (positive of total minus,positive start from 0)
		System.out.println(!c); //! can't use in integer variable
		System.out.println(!d); //! invert boolean value

	}

}
