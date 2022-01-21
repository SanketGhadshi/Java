package Collection;

import java.util.LinkedList;

public class LinkedList_RemoveElement {

    public static void main(String [] args)  
    {  
       LinkedList<String> ll=new LinkedList<String>();  
       ll.add("Ravi");  
       ll.add("Vijay");  
       ll.add("Ajay");  
       ll.add("Anuj");  
       ll.add("Gaurav");  
       ll.add("Harsh");  
       ll.add("Virat");  
       ll.add("Gaurav");  
       ll.add("Harsh");  
       ll.add("Amit");  
       System.out.println("1] Initial list of elements: "+ll);  
     
       //Removing specific element from arraylist  
          ll.remove("Vijay");  
          System.out.println("2] After invoking remove(object) method: "+ll);   
      
       //Removing element on the basis of specific position  
          ll.remove(0);  
          System.out.println("3] After invoking remove(index) method: "+ll);   
          
          LinkedList<String> ll2=new LinkedList<String>();  
          ll2.add("Ravi");  
          ll2.add("Hanumat");  
      
       // Adding new elements to Arraylist  
          ll.addAll(ll2);  
          System.out.println("4] Updated list : "+ll);   
    
       //Removing all the new elements from arraylist  
          ll.removeAll(ll2);  
          System.out.println("5] After invoking removeAll() method: "+ll);   
    
       //Removing first element from the list  
          ll.removeFirst();  
          System.out.println("6] After invoking removeFirst() method: "+ll);  
      
       //Removing first element from the list  
          ll.removeLast();  
          System.out.println("7] After invoking removeLast() method: "+ll);  
  
       //Removing first occurrence of element from the list  
          ll.removeFirstOccurrence("Gaurav");  
          System.out.println("8] After invoking removeFirstOccurrence() method: "+ll);  
      
       //Removing last occurrence of element from the list  
          ll.removeLastOccurrence("Harsh");  
          System.out.println("9] After invoking removeLastOccurrence() method: "+ll);  

       //Removing all the elements available in the list       
          ll.clear();  
          System.out.println("10] After invoking clear() method: "+ll);   
   }  
}  

