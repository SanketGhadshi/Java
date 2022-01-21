package Array;

public class Print_Odd_Index_Element {

	public static void main(String[] args) {
		
		int ar[]= {0,1,2,3,4,5};
		
		for(int i=0; i<=ar.length-1 ;i++)
		{
			if(i%2!=0) 
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
}
