package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	 public static void main(String args[]){  
		  
		  LinkedList<String> ll=new LinkedList<String>();  
		  ll.add("Ravi");  
		  ll.add("Vijay");  
		  ll.add("Ravi");  
		  ll.add("Ajay");  
		  
		  Iterator<String> itr=ll.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
		} 

