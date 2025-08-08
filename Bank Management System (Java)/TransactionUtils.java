class TransactionUtils{
    static void transactionSuccess(){
        System.out.println("Transaction completed.");
    }
    static void greet(){
        System.out.println("Thank you for banking with us!");
    }
    static void depositSuccess(){
        System.out.print("Deposit successful. "+"New Balance: $");
    }
    static void lowBalance(){
        System.out.println("Insufficient balance!");
    }
    static void withdrawSuccess(){
        System.out.print("Withdrawal successful. "+"New Balance: $");
    }
    static void minBalanceWarning(){
        System.out.print("LOW BALANCE!! Maintain minimum balance!");
    }
    static void accountLimitWarning(){
        System.out.println("Account creation limit reached, No new user can be added!");
    }
    static void accountCreationSuccess(){
        System.out.println("Account created successfully!");
    }
}
