package Encapsulation;

public class WriteOnly  {
	
	//private data member  
	private String college;  
	
	public String getCollege() {
		return college;
	}
	
	//getter method for college  
	public void setCollege(String college){  	
		this.college=college;  
		System.out.println(college);	
	}  
	}  

