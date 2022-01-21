package Array;

public class Min_Element {
 
	public static void main(String[] args) {
		
		int arr[]={3,6,1,5,98,20,45,30};
		
		int max=arr[0];
		
		for(int i=0; i<=arr.length-1; i++) {
			
			if(max>arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);	
	}
}
