package ForLoops;

public class NestedForLoop3 {

	public static void main(String[] args) {   //Pyramid pattern
		
		for(int i=0 ; i<5 ; i++) {
			
			for(int j=5 ; j>i ; j--) {
				
				System.out.print(" * ");
			}
			System.out.println();
		}

	}
}
/*  Pattern
 
 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 
 

 */