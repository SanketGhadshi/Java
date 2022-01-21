package Array;

public class DesendingOrder_Element {
	public static void main(String[] args) {

		int arr[]= {14,12,9,18,70};
		
		System.out.println("orignal  order of array :");	
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int temp=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]  < arr[j]) {
					temp=arr[i]; 
					arr[i]=arr[j]; 
					arr[j]=temp;  
				}
			   }
			  }
		System.out.println();
		System.out.println("Descending order of arry :");
		
		for(int i =0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
  }
 }
}

