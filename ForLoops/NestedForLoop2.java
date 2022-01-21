package ForLoops;

public class NestedForLoop2 {

	public static void main(String[] args) {             //Pyramid pattern
		int a=5;
		
		for(int i=0 ; i<a ; i++) {
			
			for(int j=0 ; j<i ; j++) {
				
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}/* 1st i=0,0<3-->j=0,0<0 --> *  after j++ ,j=1 then 1(j)<0(i) false, so comming out 2nd forloop
 2nd when it cooming out 2nd for loop it print ----System.out.print('*');
 3rd i=1,1<3,-->j=0,0<1,j=1,1<1--> **
 * 
 *  * 
 *  *  * 
 *  *  *  * 
 
*/