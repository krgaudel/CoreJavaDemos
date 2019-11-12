package labProjects;

public class BankAccount {

	static int accountNumber = 1000;
	double balance;
	String name;

	public BankAccount(String name, double initialBalance) {
		this.name = name;
		this.balance = initialBalance;
		accountNumber++;
	}

	public BankAccount(String name) {
		this.name = name;
		balance = 0;
		accountNumber++;

	}

	public void withdrawFunds(double withdrawAmount) {
		balance = balance - withdrawAmount;
		displayAccountInfo();
	}

	public void withdrawFunds(double withdrawAmount, double fee) {
		balance = balance - withdrawAmount - fee;
		displayAccountInfo();
	}

	public void depositFunds(double depositAmount) {
		balance = balance + depositAmount;
		displayAccountInfo();

	}

	public void depositFunds(double depositAmount, double interest) {
		balance = balance + depositAmount + balance*(interest/100);
		displayAccountInfo();

	}

	public void displayAccountInfo() {
		System.out.println("Account Name is "+ name);
		System.out.println("Account number is "+accountNumber);
		System.out.println("Account balance is "+balance);
	}
}
