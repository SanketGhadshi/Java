package ForLoops;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int a=2;
		
		for(int i=0 ; i<a ; i++)
		{
			for(int j=0 ; j<a ; j++) 
		    {
			    System.out.println(i+" "+j);
		    }
		}
	}

}
/*

0 0
0 1
1 0
1 1

*/