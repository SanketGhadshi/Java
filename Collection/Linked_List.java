// Declaring the package name
package Collection;

// Importing necessary classes
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

    public static void main(String args[]) {

        // Creating a LinkedList of Strings (generic type-safe)
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the LinkedList
        ll.add("Ravi");   // Element 1
        ll.add("Vijay");  // Element 2
        ll.add("Ravi");   // Duplicate allowed (Element 3)
        ll.add("Ajay");   // Element 4

        // Creating an Iterator to traverse the LinkedList
        Iterator<String> itr = ll.iterator();

        // Using while loop to iterate through the list
        while (itr.hasNext()) {
            // itr.next() returns the next element in the list
            System.out.println(itr.next());
        }
    }
}
