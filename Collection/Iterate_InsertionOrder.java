package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Iterate_InsertionOrder {

	 public static void main(String args[]){  
		 //Creating HashSet and adding elements  
		        LinkedHashSet<String> set=new LinkedHashSet<String>();  
		               set.add("One");    
		               set.add("Two");    
		               set.add("Three");   
		               set.add("Four");  
		               set.add("Five");  
		            System.out.println(set);
		               
		               Iterator<String> i=set.iterator();  
		               while(i.hasNext())  
		               {  
		               System.out.println(i.next());  
		               }  
		 }  
		}  

