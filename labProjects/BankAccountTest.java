package labProjects;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ramAccount=new BankAccount("Ram");
		ramAccount.displayAccountInfo();
		
		System.out.println("======================");
		
		BankAccount kulAccount=new BankAccount("Kul", 1250.00);
		kulAccount.displayAccountInfo();
		
		System.out.println("=========================");
		 ramAccount.depositFunds(500.50);
		
		 

		 
		

	}

}
