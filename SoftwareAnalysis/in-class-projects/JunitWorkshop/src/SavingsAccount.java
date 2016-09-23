public class SavingsAccount extends Account {
	private double interest;

	public SavingsAccount(String n, double bal, double interest) {
		super(n, bal);
		this.interest = interest;
	}

	void init() {
	}
}