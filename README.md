Banking System - Java Console Application
This is a simple Banking System developed in Java. The application allows users (customers) to create accounts, deposit money, withdraw funds, and transfer money between accounts. It showcases the use of Object-Oriented Programming (OOP) principles and includes basic transaction validation.

Features
Customer Management: Add new customers with unique ID numbers.
Account Management: Create bank accounts for customers, including the ability to deposit, withdraw, and check account balances.
Money Transfer: Transfer funds between customer accounts with balance checks.
Transaction Validation: Ensures that deposits and withdrawals are valid (e.g., no overdrawn accounts).
Technologies Used
Java: The core programming language for the application.
Collections (ArrayList): Used to store customers and account information.
OOP Principles: Classes for Customer, Account, and Banking System.
Basic Error Handling: Validates inputs and ensures proper transactions.
Getting Started
Prerequisites
Java Development Kit (JDK) installed on your machine.
A Java IDE like IntelliJ IDEA or Eclipse for running the project.
How to Run the Project
Clone the repository:

bash
Kodu kopyala
git clone https://github.com/your_username/banking-system.git
Open the project in your preferred Java IDE (e.g., IntelliJ IDEA).

Compile and run the Main.java file.

Running the Application via Command Line
Navigate to the project directory:

bash
Kodu kopyala
cd banking-system
Compile the Java files:

bash
Kodu kopyala
javac Main.java
Run the compiled Java program:

bash
Kodu kopyala
java Main
How the Application Works
Create Customers: The program allows the creation of customers with a name and a unique ID number.
Account Management:
Create new accounts for the customers.
Deposit and withdraw money from the accounts.
Transfer Funds: Transfer money from one customer’s account to another, ensuring the sender has enough balance.
Transaction Output: All transactions (deposits, withdrawals, transfers) will be printed in the console for easy tracking.
Example Usage
java
Kodu kopyala
// Create a new BankingSystem
BankingSystem bankingSystem = new BankingSystem();

// Add two customers
Customer customer1 = new Customer("John Doe", "1234567890");
Customer customer2 = new Customer("Jane Smith", "9876543210");

// Open accounts for each customer
Account johnsAccount = new Account("001", "Savings");
Account janesAccount = new Account("002", "Checking");

bankingSystem.openAccount(customer1, johnsAccount);
bankingSystem.openAccount(customer2, janesAccount);

// Deposit money into John's account
johnsAccount.deposit(5000);

// Transfer money from John to Jane
bankingSystem.transferMoney(customer1, "001", customer2, "002", 1000);
Future Enhancements
Add file I/O to persist customer and account data between sessions.
Implement a graphical user interface (GUI) using JavaFX for a more user-friendly experience.
Add authentication for customers with a login system.
License
This project is open-source and available under the MIT License.

