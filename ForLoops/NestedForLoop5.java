package ForLoops;

public class NestedForLoop5 {

	public static void main(String[] args) {
		
		for(int i=5 ; i>0 ; i--) {
			
			for(int j=0 ; j<i ; j++) {
				
				System.out.print(" "+j+" " );
			}
			System.out.println();
		}

	}
}
/*

 0  1  2  3  4 
 0  1  2  3 
 0  1  2 
 0  1 
 0 


*/