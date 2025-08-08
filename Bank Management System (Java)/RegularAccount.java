class RegularAccount extends User{
    static final double MIN_BALANCE = 1000;
    RegularAccount(String accountHolderName, int accountNumber, double balance){
        super(accountHolderName, accountNumber, balance);
    }
    public void createAccount(String name, double initialDeposit){
        setAccountHolderName(name);
        setBalance(initialDeposit);
    }
    public void deposit(double amount){
        setBalance(getBalance()+amount);
        TransactionUtils.depositSuccess();
        System.out.println(getBalance());

    }
    public void withdraw(double amount) throws IllegalArgumentException {
        try{
            if(getBalance()<MIN_BALANCE || getBalance()<amount){
                throw new Exception();
            }
            setBalance(getBalance()-amount);
            TransactionUtils.withdrawSuccess();
            System.out.println(getBalance());
        }
        catch(Exception e){
            TransactionUtils.lowBalance();
        }
    }
    public void displayDetails(){
        System.out.println("Name: "+getAccountHolderName());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance for "+getAccountHolderName()+" ("+getBalance()+")");
    }
}
