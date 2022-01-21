package Access_Modifier_1;

public class B {

	public void Public() {
		System.out.println("Public"); //Within project
	}
	protected void Protected() {
		System.out.println("Protected"); // within package also outside package using extends keywords
	}
	 void Default() {
		 System.out.println("Default"); //Within package
	}
	 private void Private() {
		 System.out.println("Private"); //Within class 
	 }
	 public static void main(String[] args) {
		
		 B b=new B();;
		 
		 b.Default();
		 b.Private();         //within class
		 b.Protected();
		 b.Public(); 
	}
}
