package Array;

public class Array_AsendingOrder {

	public static void main(String[] args) {

		int a[]= {40,20,10,30,50};
		
		System.out.println("orignal  order of arry :");	
		
		for(int no:a) {
			System.out.print(no+" ");
		}
		
		int temp=0;
		for(int i=0;i<=a.length-1;i++)  //i=/0
		{
			for(int j=i+1;j<=a.length-1;j++) //j=/1 //2 ///3 ////4
			{
				if(a[i]  > a[j]) { //C=/T //T ///F ////F
					temp=a[i];  //temp=/40 //20 /// ////
					a[i]=a[j];  //a[0]=/20 //10 /// ////
					a[j]=temp;  //a[1]=/40 //20 /// ////
				}
			   }
			  }
		System.out.println();
		System.out.println("Descending order of arry :");
		for(int i =0;i<=a.length-1;i++) {
			System.out.print(a[i]+" ");
  }
 }
}

