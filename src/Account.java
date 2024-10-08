public class Account {
    private String accountNumber;
    private double balance;
    private String accountType;


    // Constructor
    public Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    // Method to deposit money into the account

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. Current balance : " + balance);
        } else {
            System.out.println("Invalid deposit amount. ");
        }


    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Withdrawn. Current balance : " + balance);

        } else {
            System.out.println("Insufficient balance or invalidamount.");
        }


    }


}
