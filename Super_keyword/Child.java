package Super_keyword;

public class Child extends Parent  {

	public void ac() {
		
		int a=1;
		super.ac();   //refer parent class method Super_Class---->ac() method
		System.out.println(a);
		System.out.println("ac(Super_Use) "+super.a);  //refer immediate parent class globle variable
	
		}
	Child(){
	                   // Refer parent class constructor
		super(3);    // Constructor call must be 1st statement in body
		
	    System.out.println("Super_Use() constuctor");
		
	}

	public static void main(String[] args) {
		
		Child obj=new Child();
	    obj.ab();
		obj.ac();
		
	}

}
