import java.util.ArrayList;

public class BankingSystem {
    private ArrayList<Customer> customers; // List of all customers in the system

    // Constuructor
    public BankingSystem() {
        customers = new ArrayList<>();

    }

    // Method to add a new customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("New customer added : " + customer.getName());
    }

    // Method to find a customer by their ID number
    public Customer fintCustomer(String idNumber) {
        for (Customer customer : customers) {
            if (customer.getIdNumber().equals(idNumber)) {
                return customer;


            }
        }
        return null;
    }

    // Method to open a new account for an existing customer
    public void openAccount(Customer customer, Account account) {
        customer.getAccounts();
        System.out.println("New account opened for " + customer.getName() + ". Account number :  " + account.getAccountNumber());
    }

    // Method to transfer money from one account to another
    public void transferMoney(Customer fromCustomer, String fromAccountNumber, Customer toCustomer, String toAccountNumber, double amount) {
        Account fromAccount = findAccount(fromCustomer, fromAccountNumber);
        Account toAccount = findAccount(toCustomer, toAccountNumber);

        if (fromAccount != null && toAccount != null) {
            if (fromAccount.getBalance() >= amount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println(amount + "transferred from " + fromCustomer.getName());
            } else {
                System.out.println("Insufficient balance for transfer. ");
            }

        } else {
            System.out.println("one or both accounts not found.");
        }
    }

    // Method to find and account by account number for a given customer
    private Account findAccount(Customer customer, String accountNumber) {
        for (Account account : customer.getAccounts()) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }


}







