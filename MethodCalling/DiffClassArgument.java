package MethodCalling;

public class DiffClassArgument {

	public void duplicate() {      // Non static method
		System.out.println ("1st Non static method in DiffClassArgument");
	}
	
	public void duplicate(int a,String b) {    // Non Static method
		System.out.println("2nd Non static method in DiffClassArgument");
	}

	public static void main(String[] args) {
	System.out.println(" Class :-DiffClassArgument O/P "); 
	DiffClassArgument zx=new DiffClassArgument();  //for calling method non static method
    zx.duplicate();
	zx.duplicate(1,"sanket");    //calling method for Non Static Method of DiffClassArgument
    //Following method from different i.e SingleClass
	
	System.out.println(" Class :-SingleClassArgument O/P "); 
	
	SingleClassArgument.two("sanket") ; //calling method for Static Method of SingleClassArgument
    
	SingleClassArgument z=new SingleClassArgument();  //for calling method non static method SingleClassArgument
     z.one(true,7);
     z.one(5);
     
	}

}
