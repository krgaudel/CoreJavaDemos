package day16b_polymorphism_explicitTypeCasting;

public class CheckingAccount implements Account {

	@Override
	public void openAccount() {
		System.out.println("Checking Account is opened..");

	}
	public void withdrawAmount() {
		System.out.println(" $200.00 is withdrawn ");
	}

}
