package Collection;

import java.util.HashSet;

public class HashSet_RemovedElement {

	 public static void main(String args[]){  
		  HashSet<String> set=new HashSet<String>();  
		           set.add("Ravi");  
		           set.add("Vijay");  
		           set.add("Arun");  
		           set.add("Sumit");  
		           System.out.println("1] An initial list of elements: "+set);  
		          
		           //Removing specific element from HashSet  
		           set.remove("Ravi");  
		           System.out.println("2] After invoking remove(object) method: "+set);  
		           
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("Ajay");  
		           set1.add("Gaurav");  
		           set.addAll(set1);  
		           System.out.println("3] Updated List: "+set);  
		          
		           //Removing all the new elements from HashSet  
		           set.removeAll(set1);  
		           System.out.println("4] After invoking removeAll() method: "+set);  
		         
		           //Removing elements on the basis of specified condition  
		           set.removeIf(str->str.contains("Vijay"));    
		           System.out.println("5] After invoking removeIf() method: "+set);  
		           
		           //Removing all the elements available in the set  
		           set.clear();  
		           System.out.println("6] After invoking clear() method: "+set);  
		 }  
		}  

