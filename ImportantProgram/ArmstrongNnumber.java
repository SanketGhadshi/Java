package ImportantProgram;
import java.util.Scanner;
public class ArmstrongNnumber { //armno. is no.=addition cube of indivisual digit in no
                                //ex. 153=(1^3)+(5^3)+(3^3) , 153=1+125+27 ,  153=153
	public static void main(String[] args) {
	  int sum=0,reminder;
	  int temp;
     Scanner s=new Scanner(System.in); 
     System.out.print("Enter a number:-"); // consider no=153
     int no=s.nextInt();
     temp=no;
     while(no!=0) {
    	
    	 reminder=no%10;  //3 //5 //1 
    	 sum=sum+(reminder* reminder* reminder);//0+27=27 //27+125=152 //152+1
    	 no=no/10;       //15 //1
    	 
     }
     if(sum==temp) {   //153==153
	System.out.println(temp+" enter number is Armstrong number");
     }
      else {
    	  System.out.println(temp+" enter number is Not Armstrong number");
}
	}

}
