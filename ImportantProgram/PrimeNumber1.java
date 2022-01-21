package ImportantProgram;
import java.util.Scanner;
public class PrimeNumber1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the no:-");
		 int no=sc.nextInt();
		 int count=0;
		 if(no>1) {
			 for(int i=1;i<=no;i++) {
				 if(no%i==0) {
					 count++;
					 }
			 }
			 if(count==2) {
		 System.out.println("Given number is Prime No. :");
	}
			 else {
		 System.out.println("Given number is not Prime No. :");
}
		 }else{
	System.out.println("Given number is not Prime No. :");
}
}
}
