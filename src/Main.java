public class Main {
    public static void main(String[] args) {
        // Initialize the banking system
        BankingSystem bankingSystem=new BankingSystem();

        // Create two customers
        Customer customer1=new Customer("John Doe","123451234");
        Customer customer2=new Customer("Jane Smith","9887613134");

        //Add customers to the banking system
        bankingSystem.addCustomer(customer1);
        bankingSystem.addCustomer(customer2);

        // Open accounts for the customers
        Account jhonsAccount = new Account("001","Savings");
        Account janesAccount = new Account("002","Savings");

        bankingSystem.openAccount(customer1,jhonsAccount);
        bankingSystem.openAccount(customer2,janesAccount);

        // Deposit money into John's account
        jhonsAccount.deposit(5000);

        // Transfer money from John's account to Jane's account
        bankingSystem.transferMoney(customer1,"001",customer2,"002",1000);





    }
}
