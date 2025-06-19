package Array;

public class SingleDimessionArray {
	
	public static void main(String[] args) 
	{
		// Declare Array 
		
		// Approch 1
		int a[]=new int [5];
		// index always calls from 0
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		// Approach 2
		int b[]= {100,200,300,400,500,600,700} ;
		
		// Find length of array 
		System.out.println("1. Length of array a[] : "+a.length);
		System.out.println("1. Length of array b[] : "+b.length);

		// Read single value from array 
		System.out.println("2. Read single value from array a[] : "+a[0]);
		System.out.println("2. Read single value from array b[] : "+b[1]);
		
		// Reading all values from arrays 
		
		// Normal 
		System.out.println("3. Reading all Normal values from arrays ");
		for (int i=0; i<a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		// Enhanced for loop or for...each loop
		System.out.println("4. Enhanced for loop");
		for(int x:a) {
			System.out.println(x);
		}
	}

}
