package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_UnorderedIteration {

	 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		    HashSet<String> set=new HashSet();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five");  
		           
		           System.out.println(set);
		          
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  //Returns true if the iteration has more elements
		           {  
		           System.out.println(i.next());  
		           }  
		 }  
		} 

