package Array;

public class Twoormultidimesional {

	public static void main(String[] args) {
		
		// Declare Array 
		
		// Approch 1
		int a[][]=new int[3][2];
//		int []a[]=new int[3][2];  -- [Rows][Column]
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=100;
		a[1][1]=200;
		a[2][0]=100;
		a[2][1]=200;
		
		// Approach 2
		int b[][]= {{10,20,11},
				    {30,40,12},
				    {50,60,13},
				    {70,80,14}} ;
		
//		Find size of size of array 
		System.out.println("1. Find number of rows a: "+a.length);
		System.out.println("2. Find number of columns a: "+a[0].length);
		
		System.out.println("1. Find number of rows b: "+b.length);
		System.out.println("2. Find number of columns b: "+b[0].length);

//		Read single value from array
		System.out.println("3. Read single value from array a[rowIndex][columnIndex] : "+a[2][0]);
		System.out.println("3. Read single value from array b[rowIndex][columnIndex] : "+b[2][0]);
		
//		Normal for loop
		System.out.println("4. Normal for loop");
		for(int r=0; r<=2; r++)
		{
			for(int c=0; c<=2; c++) 
			{
//				System.out.println(b[r][c]);	
				System.out.print(b[r][c]+" ");	
			}
			System.out.println();
		}
//		OR
		System.out.println("4. Normal for loop");
		for(int r=0; r<=b.length-1; r++)
		{
			for(int c=0; c<=b[r].length-1; c++) 
			{
//				System.out.println(b[r][c]);	
				System.out.print(b[r][c]+" ");	
			}
			System.out.println();
		}
	}

}
