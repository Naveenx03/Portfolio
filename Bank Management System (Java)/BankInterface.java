interface BankInterface{
    void createAccount(String name, double initialDeposit);
    void deposit(double amount);
    void withdraw(double amount);
    void displayDetails();
}