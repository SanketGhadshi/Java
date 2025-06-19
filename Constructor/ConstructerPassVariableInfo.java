package Constructor;

public class ConstructerPassVariableInfo {
	String name;   //Instance or Global variable
	int a;         //Instance or Global variable
	ConstructerPassVariableInfo(){
		name="Sanket";   //passing the value of variable through constructer
		a=20;           //passing the value of variable through constructer
	}

	public static void main(String[] args) {  //Main Method
		
		ConstructerPassVariableInfo z=new ConstructerPassVariableInfo();
		System.out.println(z.name);
		System.out.println(z.a);
	}
}
