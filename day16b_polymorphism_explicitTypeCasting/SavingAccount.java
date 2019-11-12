package day16b_polymorphism_explicitTypeCasting;

public class SavingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("Saving account is opened..");
	}
	public void depositAmount() {
		System.out.println(" $100.00 is deposited");
	}

}
