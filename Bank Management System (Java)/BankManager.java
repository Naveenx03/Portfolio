import java.util.*;
public class BankManager {
    User[] users = new User[5];
    static int user_count = 0;
    static int accountNumber = 1000;

    void menu(int option, Scanner in){
        int index = -1;
        if(option != 1 && option !=5){
            System.out.print("Enter Account Number: ");
            index = (option != 1?userIndex(users, in.nextInt()):-1);
        }
        switch (option) {
            case 1:
                if(user_count==users.length){
                    TransactionUtils.accountLimitWarning();
                    return;
                }  
                System.out.println("Enter account type, Regular / Premium: ");
                String account = in.next();
                if(account.equalsIgnoreCase("regular")){
                    System.out.print("Account Holder Name: ");
                    in.nextLine();
                    String name = in.nextLine();
                    RegularAccount user = new RegularAccount(name, accountNumber, 0);
                    accountNumber++;
                    user.createAccount(name, 0);
                    users[user_count] = user;
                }
                else if(account.equalsIgnoreCase("premium")){
                    System.out.print("Account Holder Name: ");
                    in.nextLine();
                    String name = in.nextLine();
                    PremiumAccount user = new PremiumAccount(name, accountNumber, 0);
                    accountNumber++;
                    user.createAccount(name, 0);
                    users[user_count] = user;
                }
                else{
                    System.out.println("Invalid Input, Try again!");
                    System.out.println();
                    menu(1,in);
                }
                users[user_count].displayDetails();
                user_count++;
                TransactionUtils.accountCreationSuccess();
                break;
            case 2:
                System.out.print("Enter Amount to Deposit: ");
                int deposit_amount = in.nextInt();
                users[index].deposit(deposit_amount);
                break;
            case 3:
                System.out.print("Enter Amount to Withdraw: ");
                int withdraw_amount = in.nextInt();
                users[index].withdraw(withdraw_amount);
                break;
            case 4:
                users[index].displayDetails();
                break;
            case 5:
                TransactionUtils.greet();
                break;
            default:
                throw new IllegalArgumentException("Invalid option!");
        }
    }

    int userIndex(User[] users, int account_number){
        for(int i=0; i<user_count; i++){
            if(users[i].getAccountNumber()==account_number) return i;
        }
        throw new IllegalArgumentException("Account number incorrect!");
    } 
}
