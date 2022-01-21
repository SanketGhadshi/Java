package Array;

public class Array_Move_Element {

	public static void main(String[] args) {
		
  int	ar[]= {10,20,30,40,50};
  int temp;
 
  //move index 0 value to index 3 & vica versa
  
  temp=ar[0];
  ar[0]=ar[3];
  ar[3]=temp;
  
  System.out.println(ar[0]);
  
  System.out.println(ar[3]);

	}
}
