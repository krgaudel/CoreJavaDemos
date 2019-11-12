package day16b_polymorphism_explicitTypeCasting;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account;

//		account = new SavingAccount(); 
//		account.openAccount();
//		
//		account=new CheckingAccount();
//		account.openAccount();

		Scanner input = new Scanner(System.in);
		System.out.println("What account you want to log in? ");
		String choice = input.next();
		
		account=null;
		
		switch (choice) {
		case "checking":
			account=new CheckingAccount();
			break;
		case "saving":
			account=new SavingAccount();
			break;

		default:
			System.out.println(" This is not your bank  ");
			break;
		}
		
		if (choice !=null) {
			createAccount( account);
		}

	}

	public static void createAccount(Account account) {
		//account.openAccount();
		if(account instanceof SavingAccount) {
			SavingAccount saving=(SavingAccount)account;// explicit type casting
			saving.openAccount();
			saving.depositAmount();
			
		}
		else if (account instanceof CheckingAccount) {
			CheckingAccount checking=(CheckingAccount)account;// explicit type casting
			checking.openAccount();
			checking.withdrawAmount();
			
		}
	}
}
