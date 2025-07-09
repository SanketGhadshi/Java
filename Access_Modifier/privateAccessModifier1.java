package Access_Modifier;

public class privateAccessModifier1 {


	    public static void main(String[] args) {

	    	privateAccessModifier s1 = new privateAccessModifier();
	        
	        //  Not allowed: 'name' has private access in privateAccessModifier1
//	         s1.name = "Sanket";

	        //  Not allowed: private method
//	         s1.displayName();

	        //  Allowed: Using public method which internally accesses private data
	        s1.setName("Sanket");
	    }
	}

