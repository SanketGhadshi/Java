package ThisKeyword;

public class Invoke_Current_Class_Constuctor {
	
	Invoke_Current_Class_Constuctor(){
		//this(6); // this() is always 1st member of constuctor,otherwise show error
		System.out.println(" Default Constuctor");
		
	}
	
	Invoke_Current_Class_Constuctor(int z){
		this(); // this() is always 1st member of constuctor,otherwise show error
		System.out.println(" Paramaterized Constuctor");
	}

	public static void main(String[] args) { 
		
		// calling default constructor from paramaterized contructor	
		
		Invoke_Current_Class_Constuctor obj=new Invoke_Current_Class_Constuctor(3);
	}

}
