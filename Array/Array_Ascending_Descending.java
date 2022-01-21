package Array;

import java.util.Arrays;

public class Array_Ascending_Descending {

	public static void main(String[] args) {
		
		int array[]= {20,30,10,40,50};

		System.out.println("Random Stored data");
		for(int i=0;i<=array.length-1;i++) {
			System.out.print(array[i]+" ");
		}
		Arrays.sort(array);
		System.out.println("\n\nAscending order ");
		for(int i=0;i<=array.length-1;i++) {
			System.out.print(array[i]+" ");
		}
	//	Arrays.sort(array);
		System.out.println("\n\nDescending order ");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
	}
}
