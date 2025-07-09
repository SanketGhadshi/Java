package Encapsulation;

// Class demonstrating encapsulation
public class Student {

    // Step 1: Declare variables as private (data hiding)
    private int age;
    private String name;
    
    // Step 2: Public setter method to set value to 'age'
    public void setAge(int age) 
    {
        // Add simple validation check
        if (age > 20) {
            System.out.println("You are too old to be a student");
        } else {
            System.out.println("");  // Just a blank line; can be removed
        }

        // Assign the given value to the private variable
        this.age = age;
    }

    // Step 3: Public getter method to access private variable 'age'
    public int getAge() 
    {
        // Print current age before returning it
        System.out.println(age);
        return age;
    }


}
