package ForLoops;

public class NestedForLoop8 {

	public static void main(String[] args) {

		for(int i=0 ; i<5 ; i++) {
			
			for(int j=i ; j<=i ; j++) {
				
				System.out.print(" "+j+" ");
			}
			System.out.println();
			
		}
	}
}