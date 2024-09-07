package coursework;

public class Accounts extends Customer {
    private int accountNumber;
    private int balance;

    // Constructor
    public Accounts(String fName, String lName, int accountNumber, int balance) {
        setFirstName(fName);
        setLastName(lName);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Other methods like deposit, withdraw, etc.
    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
