package Access_Modifier;

public class privateAccessModifier {

		// Private variable: only accessible inside this class
	    private String name;

	    // Private method: only accessible inside this class
	    private void displayName() 
	    {
	        System.out.println("Student name is: " + name);
	    }

	    // Public method to safely set and display private data
	    public void setName(String studentName) 
	    {
	        name = studentName;         // allowed: same class
	        displayName();              // allowed: same class
	    }
	    
	}
