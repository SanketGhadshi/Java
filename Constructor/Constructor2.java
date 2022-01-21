package Constructor;

public class Constructor2 {
	
	Constructor2(int a){       //Argument constructer
		
		System.out.println("Argument constructer One ");
	}
	Constructor2(char b){       //Argument constructer
		
		System.out.println("Argument constructer two ");
	}

	public static void main(String[] args) {
	
		new Constructor2(2);	// 1st method to call constructer	
		new Constructor2('s');	// 1st method to call constructer	
		    // OR
		Constructor2 z=new Constructor2 (4);     //2nd method to call constructer
		Constructor2 m=new Constructor2 ('s');   //2nd method to call constructer
	}

}
