package operator;

public class TurnaryOperator1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int max=(a>b)?a:b; /* if condition (a>b) is true then 'a' value is assinged for max
		If (a<b) is false then 'b' value is assinged for max */ 
		
		System.out.println("Max value is:-"+max);
		
		int min=(a<b)?a:b; /* if condition (a>b) is true then 'a' value is assinged for max
		If (a<b) is false then 'b' value is assinged for max */ 
		
		System.out.println("Min value is:-"+min);
	}

}
