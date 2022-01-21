package ImportantProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		 int i=0;
		 int num=0;  
		 String primeNumbers=" "; //Empty String
		 
		 for(i=0;i<=20;i++) { //0 /1 //2 ///3 ////4
			 int counter=0;  //0 /0 //0 ///0 ////0
			 for(num=i;num>=1;num--) { //0 /(1/0) //(2/1/0) ///(3/2/1/0) ////(4/3/2/1/0)
				 if(i%num==0) { // /(0/ ) //(0/0/ ) ///(0/ /0/ ) ////(0/ /0/0/ ) 
					 counter=counter+1; // /(1/ ) //(1/2/ ) ///(1/ /2/ /)  ////(1/ /2/3/ )
				 }
			 }
			 if(counter==2) {// /1 //2 ///2 ////3
				 primeNumbers = primeNumbers+i+" "; //Appended the prime number to string
			 }
		 }
		 System.out.println("Prime number from 1 to 20 are :");
		 System.out.println(primeNumbers);
	}
	
}
