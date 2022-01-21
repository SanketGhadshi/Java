package Encapsulation;

import java.security.PrivateKey;

//A Java class which has only getter methods.  
public class ReadOnly {
	
	//private data member  
	private String college="AKG"; 
	
	public void setCollege(String college) {
		this.college = college;
	}  
	//getter method for college  
	public String getCollege(){  
		
		return college;  
	}
	}  

