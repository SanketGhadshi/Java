package Constructor;

public class NonArgumentConstructor {

	String name; // instance variable declaration
	int p;       
	NonArgumentConstructor(){  // nonargument Method
		name="sanket";
		p=5;
	}
	public static void main(String[] args) {
     
		NonArgumentConstructor b=new NonArgumentConstructor();
		System.out.println(b.name);
		System.out.println(b.p);
		
	}

}
