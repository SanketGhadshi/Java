package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_To_Array {
	public static void main(String args[]){  
		 List<String> List = new ArrayList<>();    
		 List.add("Mango");    
		 List.add("Banana");    
		 List.add("Apple");    
		 List.add("Strawberry");    
		 System.out.println("Printing List: "+List); 
		 
		 //Converting ArrayList to Array  
		 
		 String[] array = List.toArray(new String[List.size()]);
		 
		 System.out.println("Printing string: "+Arrays.toString(array));  
		 
		}  
		} 
