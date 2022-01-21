package pattern_printing;

public class Star_patterns {

	public static void main(String[] args) {
		pattern1(7);
		System.out.println();
		pattern2(7);
		System.out.println();
		pattern3(5);
		System.out.println();
		pattern4(5);
		System.out.println();
		pattern5(5);
		System.out.println();
		pattern6(5);
		System.out.println();
		pattern7(5);
		System.out.println();
		pattern8(4);
		System.out.println();
		pattern9(5);
		System.out.println();
		printPascal(5);


		
	}
	
	static void pattern1(int n) {
		System.out.println("pattern1");
//		
//		*
//		**
//		*
//		**
//		***
		for(int row=1;row<=n;row++) {
			
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		System.out.println("pattern2");
//***
//**
//***
//**
//*
//**
//*
		for(int row=n;row>=1;row--) {
			
			for(int col=1; col<=row ;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern3(int n) {
		System.out.println("pattern3");
//		1
//		12
//		123
//		1234
//		12345
		for(int row=1; row<=n; row++) {
			
			for(int col=1; col<=row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
System.out.println("pattern4");
//		1
//		12
//		123
//		1234
//		12345
		for(int i=1;i<n*2;i++) {
			
			int cols = i > n ? 2 * n - i : i;
			for(int j=1;j<=cols;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void pattern5(int n) {
		System.out.println("pattern5");
//	     1 
//	    1 2 
//	   1 2 3 
//	  1 2 3 4 
//	 1 2 3 4 5 
//	  1 2 3 4 
//	   1 2 3 
//	    1 2 
//	     1 

		for(int i=1;i<n*2;i++) {
			
			
			int cols = i > n ? 2 * n - i : i;
			int spaces = n - cols;
			for(int t=0;t<spaces;t++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=cols;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern6(int n) {

//	        1  
//	      2 1 2 
//	    3 2 1 2 3 
//	  4 3 2 1 2 3 4 
//	5 4 3 2 1 2 3 4 5 
		for(int i=1;i<=n;i++) {
			
			
			for(int y=1;y<=(n-i);y++) {
				System.out.print("  "); 
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int t=2;t<=i;t++) {
				System.out.print(t+" ");
			}
			
			System.out.println();
		}
	}
	
	static void pattern7(int n) {


	//	        1 
	//	      2 1 2 
	//	    3 2 1 2 3 
	//	  4 3 2 1 2 3 4 
	//	5 4 3 2 1 2 3 4 5 
	//	  4 3 2 1 2 3 4 
	//	    3 2 1 2 3 
	//	      2 1 2 
	//	        1 
	
		for(int i=1;i<n*2;i++) {
			
			int col = i > n ? 2*n - i : i;
			int space = n-col;
			for(int y=0;y<space;y++) {
				System.out.print("  "); 
			}
			for(int j=col;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int t=2;t<=col;t++) {
				System.out.print(t+" ");
			}
			
			System.out.println();
		}
		
	}
	
	static void pattern8(int n) {
		
		int val = n*2;
		for(int i=1;i<val;i++) {
			
			for(int j=1;j<val;j++) {
				int index =1+(n - Math.min(Math.min(i, j), Math.min(val-i, val-j)));
				System.out.print(index+" ");
			}
			System.out.println();
			
		}
		
	}
	
	static void pattern9(int n) {
//		n=5
//		int val = n*2;
		for(int i=0;i<n;i++) {
			
			for(int t=1;t<(n-i);t++) {
				System.out.print(" ");
			}
			for(int j=1;j<=((i*2)+1);j++) {
				
				if(j%2!=0) {
					System.out.print(1);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
		
	}
	
	public static void printPascal(int n)
    {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
 
            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {
 
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}

