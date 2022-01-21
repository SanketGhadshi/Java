package Encapsulation;

public class Student {

	private int age;
	private String name;
		
  public int getAge() {
	System.out.println(age);
	  return age;
      }
  
  public void setAge(int age) {
	  if(age>20) {
		  System.out.println("You are too old to be a student");
	  }else {
		System.out.println("");
	}
	 this.age=age;		  
  }
}
