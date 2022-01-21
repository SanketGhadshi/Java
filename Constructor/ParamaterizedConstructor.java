package Constructor;

public class ParamaterizedConstructor {
	int empId;
	String empName;
	
	ParamaterizedConstructor(int id,String name){   //Paramaterized Constructor
		empId=001;
		empName="Sank";
		System.out.println(id);
		System.out.println(name);
	}
	ParamaterizedConstructor(int id){        //Paramaterized Constructor
		empId=002;
		empName="Sanket";
	}
	public static void main(String[] args) {
		// new ParamaterizedConstructor(2,"San");
		
		ParamaterizedConstructor x=new ParamaterizedConstructor(2,"Ankita");
		    System.out.println(x.empId);
			System.out.println(x.empName);
			
		ParamaterizedConstructor y=new ParamaterizedConstructor(2);	
		    System.out.println(y.empId);
		    System.out.println(y.empName);
		    
	}

}
;