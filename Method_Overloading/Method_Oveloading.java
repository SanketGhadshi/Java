package Method_Overloading;

public class Method_Oveloading {
	
	static void renu(int b) {
		System.out.println("renu(int a)");
	}
	static void renu(int b,int a,char n) {
		System.out.println("renu(int b,int a,char n)");
	}
	static void renu(char b) {
		System.out.println("renu(char b)");
	}
	 void renu(byte b) {
		System.out.println("renu(byte b)");
	}
	 void renu(String b) {
		System.out.println("renu(String b)");
	}

	public static void main(String[] args) {
		renu(9);
		renu(2,5,'s');
		renu('h');
		Method_Oveloading obj=new Method_Oveloading();
		obj.renu(3);
		obj.renu("san");
		
		
		

	}

}
