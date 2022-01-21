package ImportantProgram;
import java.util.Scanner;
public class PrimeNumber2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y,c;
		System.out.print("Enter starting no:"); //0
		 x=s.nextInt();
		 System.out.print("Enter ending no:"); //10
		 y=s.nextInt();
		 System.out.println("Enter Prime no. between "+x+" & "+y+" are ");
		 
		 for(int i=x;i<=y;i++) { //0 //1 ///2 ////3
			 c=0; //0 //0 ///0 ////0
			 for(int j=1;j<=i;j++) { // //(1) ///(1/2) ////(1/2/3)
				 if(i%j==0) // //0 ///(0/0) ////(0/ /0)
					 c=c+1; // //1 ///(1/+1) ////(1/ /+1)
			 }
			 if(c==2) //0 //1 ///2 ////2
		  System.out.print(i+" ");  // // ///2 ////3
		 } 

	}

}
