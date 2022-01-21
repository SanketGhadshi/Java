package ThisKeyword;

public class Invoke_Current_Class_Constuctor1 {
	
	Invoke_Current_Class_Constuctor1(){
		
		this(1); // this() is always 1st member of constuctor,otherwise show error
		System.out.println(" Default Constuctor one");
		
	}
	
	Invoke_Current_Class_Constuctor1(int z){
		
		System.out.println(" Paramaterized Constuctor one");
	}

	public static void main(String[] args) { 
		
		// calling paramaterized contructor from default constructor  	
		
		Invoke_Current_Class_Constuctor1 obj=new Invoke_Current_Class_Constuctor1();
	}

}