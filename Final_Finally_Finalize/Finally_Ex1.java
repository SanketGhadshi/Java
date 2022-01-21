package Final_Finally_Finalize;

public class Finally_Ex1 {

	public static void main(String args[]){ 
		try{
		
			int x=100; 
		} 
		catch(Exception e) {
		 System.out.println("Defect present  in code"); 
		} 
		finally {
		 System.out.println("finally block is executing");
		 }
		}
	}

