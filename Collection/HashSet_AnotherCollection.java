package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_AnotherCollection {

	 public static void main(String args[]){  
		   ArrayList<String> list1=new ArrayList<String>();  
		           list1.add("Ravi");  
		           list1.add("Vijay");  
		           list1.add("Ajay");  
		             
		           System.out.println("List1 : "+list1);
		           
		           HashSet<String> set=new HashSet(list1); //List datatype 
		           set.add("Gaurav"); 
		           System.out.println(set);
		           
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  //Returns true if the iteration has more elements,returns true if next wouldreturn an element 
		           {  
		           System.out.println(i.next());  //Returns the next element in the iteration
		           }  
		 }  
		} 
