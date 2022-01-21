package SwitchCaseStaments;

public class SwitchStatement2 {

	public static void main(String[] args) {
        
		   String s="one";                          // switch(Expression) {
	       switch(s) {                       // case 1:
	       case "one":                             // # code;  here multiple cases uses
	    	   System.out.println("Sunday");   // break;  
	       case "Two":
	    	   System.out.println("Monday");  //here we not break any case,so after case all cases 
	       case "Three":
	    	   System.out.println("Tuesday"); // all cases printring
	       case "Four":
	    	   System.out.println("Wensday");
	       case "Five":
	    	   System.out.println("Thursday");
	       case "Six":
	    	   System.out.println("Frieday");
	       case "Seven":
	    	   System.out.println("Saturday");
	       }
		}

	}