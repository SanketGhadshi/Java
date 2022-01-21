package Final_Finally_Finalize;

public class Finalize_Ex1 {

	public void finalize() { 		
		System.out.println("Finalize is called"); 
		} 
		public static void main(String args[]) { 
			
			Finalize_Ex1 f1=new Finalize_Ex1(); 
			Finalize_Ex1 f2=new Finalize_Ex1(); 
//		f1=NULL ; 
//		f2=NULL; 
		System.gc(); 
		
		} 
		}

