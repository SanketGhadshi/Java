package Collection;

// Importing required classes
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Methods {

    public static void main(String[] args) {

        // Creating an ArrayList of String with generic type
        List<String> cars = new ArrayList<String>();  // Preferred: type-safe

        // Creating a raw type list (not type-safe)
        List vehicle = new ArrayList();

        // Adding elements to the 'cars' list
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add(" ");         // Adding a blank string
        cars.add("Mazda");

        System.out.println(cars);  // Initial list

        // Adding more elements (duplicates allowed)
        cars.add("Maruti");
        cars.add("Volvo");    // Duplicate value
        cars.add(" ");        // Duplicate blank string

        System.out.println("1) Updated string:-\n" + cars);

        // Checking if "Maruti" exists in the list (returns true or false)
        boolean containsMaruti = cars.contains("Maruti");
        System.out.println("2) cars.contains(\"Maruti\"):\n" + containsMaruti);

        // Checking if all elements of 'vehicle' list exist in 'cars'
        boolean containsAll = cars.containsAll(vehicle);  // Will return true (empty list is always contained)
        System.out.println("3) cars.containsAll(vehicle):\n" + containsAll);

        // Adding an element at a specific index (index 0)
        cars.add(0, "Mahindra");  // Adds "Mahindra" at the beginning
        System.out.println("4) Add data to specified index:\n" + cars);

        // Adding all elements of 'vehicle' list to 'cars' list
        // Nothing added here because 'vehicle' is empty
        cars.addAll(vehicle);
        System.out.println("5) cars.addAll(vehicle):\n" + cars);

        // Adding all elements of 'cars' into itself at index 3 (causes list to grow)
        cars.addAll(3, cars);
        System.out.println("6) cars.addAll(3, cars):\n" + cars);

        // Comparing 'cars' list to the string "Volvo" (wrong type, so always false)
        boolean isEqual = cars.equals("Volvo"); // false: comparing List to String
        System.out.println("7) cars.equals(\"Volvo\"):\n" + isEqual);

        // Accessing an element by index
        System.out.println("8) cars.get(1): " + cars.get(1));  // Gets the 2nd element

        // Modifying an element at index 1
        cars.set(1, "MAT");  // Replaces the 2nd element with "MAT"
        System.out.println("9) cars.set(1, \"MAT\"):\n" + cars);
    }
}
