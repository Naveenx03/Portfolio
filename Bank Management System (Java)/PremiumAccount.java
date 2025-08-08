class PremiumAccount extends RegularAccount{
    static final double MIN_BALANCE = 1000;
    PremiumAccount(String accountHolderName, int accountNumber, double balance){
        super(accountHolderName, accountNumber, balance);
    }
    public void withdraw(double amount){
        try{
            if((getBalance()-amount)<MIN_BALANCE){
                TransactionUtils.minBalanceWarning();
                System.out.println();
            }
            if(getBalance()<amount) throw new IllegalArgumentException();
            setBalance(getBalance()-amount);
            TransactionUtils.withdrawSuccess();
            System.out.println(getBalance());
            
        }
        catch(IllegalArgumentException e){
            TransactionUtils.lowBalance();
            return;
        }

    }
}