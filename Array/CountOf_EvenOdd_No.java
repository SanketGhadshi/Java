package Array;

public class CountOf_EvenOdd_No {

	public static void main(String[] args) {
		
		  int  a[]={10,11,2,17,15} ;
           int even=0;
           int odd=0;
        for(int i=0 ; i<=a.length-1 ;i++){
         if(a[i]%2==0){
         even++;
         }
       else{
      odd++;
       }
   }
         System.out.println("Even No Count: "+even);
         System.out.println("Odd No Count: "+odd);
	}
}
