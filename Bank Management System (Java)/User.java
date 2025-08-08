abstract class User implements BankInterface{
    private String accountHolderName;
    private int accountNumber;
    private double balance = 0;
    static int userCount = 0;
    User(String accountHolderName, int accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        userCount++;
    }

    
    public String getAccountHolderName() {
        return accountHolderName;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }


    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static void setUserCount(int userCount) {
        User.userCount = userCount;
    }
    public abstract void displayDetails();
}