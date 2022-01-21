package ThisKeyword;

public class Invoke_Current_Class_Method {
	
	public void A() {
		this.A(true);
		this.B();
		this.B('c');
		System.out.println(" A() Non static method");
	
	}
	public void A(boolean a) {
	
		System.out.println(" A(boolean) Non static method");
	}
	public static void B() {
		
		System.out.println(" B() Static method");
	}
	public static void B(char a) {
		System.out.println(" B(char a) Static method");
	}

	public static void main(String[] args) {
		
	 Invoke_Current_Class_Method obj=new  Invoke_Current_Class_Method();
	 obj.A();

	}

}
