package SwitchCaseStaments;
import java.util.Scanner;
public class Switchcase_Calci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int d;	
	System.out.print("Enter 1st No:- ");
	int a=sc.nextInt();
	System.out.print("Enter 1st No:- ");
	int b=sc.nextInt();
	System.out.println("1.Addition\n2.Subtraction\n3.division\n4.Multiplication\n5.Modulo");
	int c=sc.nextInt();
	
	switch(c) {
	case 1:
		d=a+b;
		System.out.println("a+b= "+d);
		break;
	case 2:
		d=a-b;
		System.out.println("a-b= "+d);
		break;	
	case 3:
		d=a/b;
		System.out.println("a/b= "+d);
		break;
	case 4:
		d=a*b;
		System.out.println("a*b= "+d);
		break;	
	case 5:
		d=a%b;
		System.out.println("a%b= "+d);
		break;
	default:
		System.out.println("Invalid operation");
	}
		

	}

}
