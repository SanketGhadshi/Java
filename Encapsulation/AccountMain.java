package Encapsulation;

public class AccountMain {

    public static void main(String[] args) 
    { 
        // Creating object of Account class
        Account ac = new Account();

        // Setting account number using setter method
        ac.setAccno(1017739995);

        // Getting account number using getter method and printing it
        System.out.println(ac.getAccno());

        // Setting account holder name using setter method
        ac.setName("Bank Of India");

        // Getting name using getter method and printing it
        System.out.println(ac.getName());
    }
}
