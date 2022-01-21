package Abstraction;

public class Bike extends Vehicle {

	 Bike(){
		 super(5);
		 System.out.println("Bike():-Constructor ");
		
	 } 
	 public void one(){
		 
		 System.out.println("one():-Method ");
		  
	  }
	 
	  void two(){
		  System.out.println("two():-Method ");
		  
	  }
	 public static void four() {
			 
			 System.out.println("four() :-Bike Method ");
	  } 
		 
	public static void main(String[] args) {

		Bike obj=new Bike();
		obj.one();
		obj.two();
		
		three();
		four();
		
		
	//	Vehicle o=new Bike();
	//	Vehicle a=new Vehicle(); //error :-we can't create object of Abstract Class
	
	}

}
