package Inheritance;

public class C extends B {
	
		public void C() {
			System.out.println(" C class");
		}
		public static void Cone() {
			System.out.println("Cone():- C class");
		}
		public static void main(String[] args) {
			AOne();
			BOne();
			Cone();
			
	         C obj=new C();
	         obj.A();
	         obj.B();
	         obj.C();
	}
}
