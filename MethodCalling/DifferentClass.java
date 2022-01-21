package MethodCalling;

public class DifferentClass {

	public void test() { // Non static method
		System.out.println (" test() Non static method in Different class");
	}
	
	public static void test1() {      // Static method
		System.out.println("test1() Static method in Different class");
	}

	public static void main(String[] args) {
	
	DifferentClass zx=new DifferentClass();  //for calling method non static method
		         zx.test();
  DifferentClass.test1();    //calling method for Static Method of DifferentClass
        
	 //Following method from different i.e SingleClass
    
  SingleClass.test3();  //calling method for Static Method of Single Class
    
	 SingleClass z=new SingleClass();  //for calling method non static method
     z.test(); 
	}

}
/* class Single {
	
	public void test() {      // Non static method
		System.out.println (" Single Non static");
	}
	
	public static void test1() {      // Static method
		System.out.println("Single  static");
	}

	public static void main(String[] args) {
	
		SingleClass z=new SingleClass();  //for calling method non static method
		         z.test();
        test1();    //calling method for Static Method
         //OR
        SingleClass.test1();//calling method for Static Method 
        z.test1(); 
	}

}
*/
