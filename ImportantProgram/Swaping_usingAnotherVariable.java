package ImportantProgram;

public class Swaping_usingAnotherVariable {

	public static void main(String[] args) {
		 int a=20, b=30, temp;
        
		 System.out.println("before Swapping a :- "+a);		 
		 System.out.println("before Swapping b :- "+b);
		
		 temp=a;
		 a=b;
		 b=temp;
		 
		 System.out.println("After Swapping a :- "+a);
		 System.out.println("After Swapping b :- "+b);
	}
}
