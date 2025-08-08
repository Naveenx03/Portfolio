# Banking Management System

 I built a console-based banking system by implementing OOP concepts.

## What this project does?

 It manages user bank accounts and performs common banking operations.

Each user can:
 - Create a **Regular** or **Premium** account.
 - Deposit money.
 - Withdraw money (with minimum balance rules).
 - View account details.

 The program stores account details in memory during runtime.

## Project Structure

 Main.java // Runs the program  
 BankInterface.java // Interface defining core banking actions  
 User.java // Abstract base class with common account fields  
 RegularAccount.java // Extends User, implements Regular account logic  
 PremiumAccount.java // Extends RegularAccount, overrides withdrawal rules  
 BankManager.java // Handles menu, user input, and account storage  
 TransactionUtils.java // Utility class for transaction messages  
 
### Main Class
 - Handles menu display and user choices.
 - Passes user input to `BankManager`.
 - Exits safely when the user chooses to quit.

### BankInterface
 - Declares:
   - `createAccount(String, double)`
   - `deposit(double)`
   - `withdraw(double)`
   - `displayDetails()`

### User Class (abstract)
 - Holds common fields: account holder name, account number, balance.
 - Provides getters and setters for fields.
 - Declares `displayDetails()` as an abstract method for child classes to implement.

### RegularAccount Class (extends User)
 - Implements minimum balance rules.
 - Provides `createAccount()`, `deposit()`, and `withdraw()` with validation.
 - Displays account details including balance.

### PremiumAccount Class (extends RegularAccount)
 - Inherits Regular account features but modifies withdrawal rules.
 - Placeholder for future bonus features.

### BankManager Class
 - Manages account storage and menu operations.
 - Handles account creation, deposit, withdrawal, and balance display.
 - Searches accounts by account number.

### TransactionUtils Class
 - Provides static methods to print transaction messages (deposit success, low balance, etc.).

## Working

 1. The program displays a menu with options:
    - Create Account
    - Deposit
    - Withdraw
    - Check Balance
    - Exit
 2. For creating an account:
    - You choose account type (Regular or Premium).
    - Enter account holder name.
    - Account is created with an initial balance (can deposit later).
 3. For deposits and withdrawals:
    - You enter the account number.
    - Enter the amount to deposit or withdraw.
    - Program updates the balance and shows confirmation messages.
 4. You can view account details at any time.
 5. Program exits when option 5 is selected.