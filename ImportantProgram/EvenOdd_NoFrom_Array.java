package ImportantProgram;

public class EvenOdd_NoFrom_Array {

	

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		int even = 0;
		int odd=0;
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
		}
		System.out.println("Count of Even no. "+even);
		System.out.println("Count of Odd no. "+odd);
	}

}
