package If_IfElse_IfElseif;

public class NestedIfElse {

	public static void main(String[] args) {
          String Un="Sanket";
          String Pwd="Sanket@123"; 
          
          if(Un=="Sanket") 
          {
             if(Pwd=="Sanket@1230") 
             {
        	     System.out.println("Login Successfully");
             }
             else 
             {
        	     System.out.println("Wrong password");  
             }
	      }  
          else 
          {
  	          System.out.println("Wrong Username");  
          }
	}
}
