package MethodOverriding;

public class Bike extends Vehicle {

	public void run() {
		
	//	super.run();  //use to invokes parent class method 
	    System.out.println("run()--Bike");
	//	super.fast(); //use to invokes parent class method
		}
public static void fast() {
		System.out.println("fast()--Bike");
	}
	public static void main(String[] args) {
		
	/*	 Bike a=new  Bike(); // called only child(Bike) class methods
		 a.run();
		 a.fast();   */
		 
	/*	Vehicle ab=new Vehicle();  // called only parent(Vehicle) class methods
		 ab.run();
		 ab.fast();  */
		 
		 Vehicle ac=new Bike();
		 ac.run();
		 ac.fast();
		
	// Bike ad=new Vehicle();  // error ---Type mismatched

	}

}
