package Abstraction;

public abstract class Vehicle {

	public Vehicle(int a){
		System.out.println("onstructor Vehicle()");
	}
	
	 abstract public void one();
	
	 abstract  void two();
	 
	 public static void three() {
		System.out.println("Vehicle three()");
	 }
}
