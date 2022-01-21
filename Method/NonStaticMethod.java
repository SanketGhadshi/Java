package Method;

public class NonStaticMethod {

	public static void main(String[] args) {     //main method
		
	NonStaticMethod a=new NonStaticMethod(); // Crete obj. of class NonStaticMethod
	a.myClass1();   //reference of Non static method
	a.myClass();    //reference of Non static method
	 
	}
	  public void myClass(){       // Non static method
      System.out.println("Run Non static Method 1");
	}
		public void myClass1(){   // Non static method
	 System.out.println("Runing Non static method 2"); 
}
} 
/* Here program not run because reference object is not declare in main method
 For Non static Method create to object like following 
 ClassName x=New ClassName();
 x.MethodName();
 
 For static method :- MethodName(); */