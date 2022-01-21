package Method;

public class StaticNonstaticMethod {		
	
	public static void myClass(){  //Staic Method
	System.out.print("Roll No :-");
}
	public void myClass1(){  //Non Staic Method
    System.out.println("21");
}	
	public static void main(String[] args) { //main method
		
	  myClass();  //reference of static method
	  
	  StaticNonstaticMethod a =new StaticNonstaticMethod();
		
	  a.myClass1(); //reference of Non static method
	
	}

}