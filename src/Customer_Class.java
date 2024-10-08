import java.util.ArrayList;

public class Customer_Class {
    private String name;
    private String idNumber;
    private ArrayList<Account> accounts;

    //Constructor
    public Customer_Class(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    // Method to add a new account to the customer
    public  void addAccount(Account account){
        accounts.add(account);
    }

}
