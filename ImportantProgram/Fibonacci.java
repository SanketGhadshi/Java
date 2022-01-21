package ImportantProgram;

public class Fibonacci {

	public static void main(String[] args) {
    int a,b,c;
    a=0;b=3;
    
    System.out.print(a+" "+b);
    
    for(int i=0;i<=10;i++) {
    	c=a+b;
    	System.out.print(" "+c);
    	a=b;
    	b=c;
    }
		
	}

}
