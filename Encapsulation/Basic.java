package Encapsulation;

public class Basic {
//	Wrapping up data and methods in single unit (class), no one can directly access variable, 
//	we oprate variables trough metods
	//A Java class which is a fully encapsulated class.  
	//It has a private data member and getter and setter methods.  
		
	   //private data member  
		private String name;  
		
		//getter method for name  
		public String getName(){  
		return name;  
		}
		
		//setter method for name  
		public void setName(String name){  
		this.name=name; 
		}  
		  
	}


