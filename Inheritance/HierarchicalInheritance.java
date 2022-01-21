package Inheritance;

public class HierarchicalInheritance {
	// E extends D ; F extends D

	public static void main(String[] args) {
		
	F ab=new F();  //F is sub class ,D super class
	ab.fOne();
	ab.dOne();
	
	
	E ac=new E();   //E is sub class ,D super class
	ac.eOne();
	ac.dOne();
	
	}

}
