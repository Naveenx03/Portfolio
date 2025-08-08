import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankManager manager = new BankManager();
        while (true) {
            System.out.println("----- Welcome to OOPS Bank -----");
            System.out.println();
            System.out.println("1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit.");
            System.out.println();
            System.out.println("Enter choice: ");
            int choice = in.nextInt();
            manager.menu(choice, in);
            if(choice==5) break;
        }
        in.close();
    }
}
