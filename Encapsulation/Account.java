package Encapsulation;

// Account class demonstrating basic encapsulation
public class Account {

    // Private data members: only accessible inside this class
    private int accno;         // Account number
    private String name;       // Account holder name
    private double amount;     // Account balance

    // Setter method to assign value to accno (account number)
    void setAccno(int accno) {
        this.accno = accno;    // 'this.accno' refers to the instance variable
    }

    // Getter method to return value of accno
    int getAccno() {
        return accno;
    }

    // Setter method to assign value to name
    void setName(String name) {
        this.name = name;
    }

    // Getter method to return value of name
    String getName() {
        return name;
    }
}
