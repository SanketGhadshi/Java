package SwitchCaseStaments;

public class switchStatement1 {

	public static void main(String[] args) {//syntax of switch case is :-
	    
		   int day=3;                          // switch(Expression) {
	       switch(day) {                       // case 1:
	       case 1:                             // # code;  here multiple cases uses
	    	   System.out.println("Sunday");   // break;  
	       case 2:
	    	   System.out.println("Monday");  //here we not break any case,so after case all cases 
	       case 3:
	    	   System.out.println("Tuesday"); // all cases printring
	       case 4:
	    	   System.out.println("Wensday");
	       case 5:
	    	   System.out.println("Thursday");
	       case 6:
	    	   System.out.println("Frieday");
	       case 7:
	    	   System.out.println("Saturday");
	       }
		}

	}