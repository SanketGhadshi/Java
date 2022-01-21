package operator;

public class LogicalOrOperator {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	
	System.out.println(a<b || b<c); //  True || True = True
	System.out.println(a>b || b>c); // False || False = False
	System.out.println(a<b || b>c); //  True || False = True 
	System.out.println(a>b || b<c); // False || True = True
	}

}
