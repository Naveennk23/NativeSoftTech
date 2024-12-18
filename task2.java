
/*lass BankingApplication{
	private String CreateAccount;
	private String Depositing;
	private String WithDraw;
	private String CheckBalance;
	
}
class user implements BankingApplication{
	private Scanner sc;
	public user(Scanner sc) {
		this.sc=sc;
	}
	public String CreateAccount() {
		System.out.println("enter the details  to create account");
		System.out.println("enter the name:");
		String a = sc.nextLine();
		System.out.println("Enter the Password:");
		String b = sc.nextLine();
		System.out.println("Enter the Gmail:");
		String c = sc.nextLine();
		System.out.println("Successfull created your account");
		System.out.println("Account Holder Name:"+a);
		System.out.println("Your Password:"+b);
		System.out.println("Your Gmail:"+c);
	}
	public String Depositing() {
		List<String>nv = new ArrayList<>();
		nv.add(sc);
		System.out.println(nv);
		
	}
	public String WithDraw() {
		List<String> va = new ArrayList<>();
		System.out.println("Enter the Money to WithDraw:");
		va.remove(sc);
		
		System.out.println("Your Money Was WithDrawn:"+va);		
	}
	public String CheckBalance() {
		String balance = sc.nextLine();
		System.out.println("Your Balance Is:"+balance);
	}
}

public class task2 {
	public static void main(String[] args) {	
Scanner sc = new Scanner(System.in);
user n = new user();
while(true) {
System.out.println("Please Select the operation:1.CreateAccount  2.Depositing  3.WithDraw  4.CheckBalance 5.exit");
   int choice = sc.nextInt();
   switch(choice) {
   case 1:
	   n.CreateAccount();
   case 2:
	   n.Depositing();
   case 3:
	   n.WithDraw();
   case 4:
	   n.CheckBalance();
   case 5:
	   System.out.println("existing the option");
	   sc.close();
	   return;
	   default:
		 System.out.println("invalid operation: Please Select Correct Operation");  
   }
   }
	}
}*/





/* Implement a console-based menu system for user interactions.
 Develop methods for creating accounts, depositing, withdrawing,
 and checking account balances. Use arrays or ArrayLists to store
 account information*/
package Task;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Account {
    String name;
    String password;
    String email;
    double balance;

    Account(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.balance = 0.0;
    }
}

class BankingApplication {
    private ArrayList<Account> accounts;
    private Scanner sc;

    public BankingApplication(Scanner sc) {
        this.sc = sc;
        this.accounts = new ArrayList<>();
    }

    public void createAccount() {
        System.out.println("Enter the details to create account");
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the Password: ");
        String password = sc.nextLine();
        System.out.print("Enter the Email: ");
        String email = sc.nextLine();

        Account newAccount = new Account(name, password, email);
        accounts.add(newAccount);
        System.out.println("Successfully created your account");
    }

    public void deposit() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        for (Account account : accounts) {
            if (account.name.equals(name)) {
                account.balance += amount;
                System.out.println("Successfully deposited: " + amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraw() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // Consume newline

        for (Account account : accounts) {
            if (account.name.equals(name)) {
                if (account.balance >= amount) {
                    account.balance -= amount;
                    System.out.println("Successfully withdrawn: " + amount);
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void checkBalance() {
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        for (Account account : accounts) {
            if (account.name.equals(name)) {
                System.out.println("Your balance is: " + account.balance);
                return;
            }
        }
        System.out.println("Account not found.");
    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      BankingApplication app = new BankingApplication(sc);

        while (true) {
            System.out.println("Please Select the operation: 1.CreateAccount  2.Deposit  3.Withdraw  4.CheckBalance  5.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    app.createAccount();
                    break;
                case 2:
                    app.deposit();
                    break;
                case 3:
                    app.withdraw();
                    break;
                case 4:
                    app.checkBalance();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid operation: Please Select Correct Operation");
            }
        }
    }
}
