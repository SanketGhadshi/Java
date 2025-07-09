// Declaring package name
package Collection;

// Importing required classes from java.util package
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_To_List {

    public static void main(String[] args) {
        
        // Creating and initializing a String array with programming languages
        String array[] = {"Java", "Python", "PHP", "C++"};
        
        // Optional: Print array using Arrays.toString() for visualization
        // System.out.println("Printing Array: " + Arrays.toString(array));

        // Creating an empty ArrayList of type String
        List<String> list = new ArrayList<String>();

        // Looping through each element in the array
        // Using for-each loop to add each array element to the list
        for (String lang : array) {
            list.add(lang); // Adding language name to the list
        }

        // Printing the final list after conversion
        System.out.println("Printing List: " + list);
    }
}
