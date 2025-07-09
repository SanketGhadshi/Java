// Package declaration (optional, depends on your project structure)
package Collection;

// Importing required classes from java.util package
import java.util.ArrayList;
import java.util.List;

public class Array_List {

    public static void main(String[] args) {

        // Creating a List reference and initializing it with an ArrayList object
        // Using raw type (no generic type specified), so it can hold any type of object
        List l = new ArrayList();

        // Adding Integer values to the list
        l.add(1);           // Auto-boxing from int to Integer
        l.add(2);           // Auto-boxing from int to Integer

        // Adding String values to the list
        l.add("Sanket");
        l.add("Ghadshi");

        // Printing the entire list
        // Output: [1, 2, Sanket, Ghadshi]
        System.out.println(l);
    }
}

