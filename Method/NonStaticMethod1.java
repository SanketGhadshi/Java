package Method;

public class NonStaticMethod1 {
	
	public void myClass()
	{ //Non Static Method
    
		System.out.print("Roll No :- ");
    }
	public void myClass1()
	{  //Non Static Method
    
		System.out.println("21");
    }
	
	public static void main(String[] args) { //main method
	
	NonStaticMethod1 a = new NonStaticMethod1();
	a.myClass(); 	//reference of Non static method
	a.myClass1();   //reference of Non static method
	}

}