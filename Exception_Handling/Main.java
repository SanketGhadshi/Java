package Exception_Handling;

public class Main {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		try {
//			divide(a,b);
//			Mimicing
//			throw new Exception("Just for fun");
			String name = "Sanket";
			throw new MyException("name is Sanket");
			
		}
		
		catch(MyException e){
			System.out.println(e.getMessage());
		}
		
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) { // if use in 1st catch then reaming catches are not execute bcz Exception is parent of all
			System.out.println("Normal Exception");
		}
		
        finally {
        	System.out.println("Finally will always execute");
        }
	}
       static int divide(int a, int b) throws ArithmeticException {
	              if(b == 0) {
	            	  throw new ArithmeticException("Please do no divide by zero");
	              }
	              return a /b ;
}
}
