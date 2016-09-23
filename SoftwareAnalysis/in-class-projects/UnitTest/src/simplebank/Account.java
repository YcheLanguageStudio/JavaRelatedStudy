package simplebank;

import java.util.*;

public class Account {
	private String name;
	private double balance;

	public Account(String n, double bal) {
		this.name = n;
		this.balance = bal;

		print();
	}


	public Account () {
		Scanner in = new Scanner(System.in);

		System.out.print("Account name? ");
		this.name = in.nextLine();

		System.out.print("Initial balance? ");
		this.balance = in.nextDouble();

		print();
	}
	

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double b) {
		this.balance = b;
	}

	// Print the balance of this account
	public void print() {
		System.out.println("Account - " + this.name + " has a balance of $" + this.balance);
	}

	public static void main(String args[]) {
		Account acc;

		acc = new Account("Jino Lee", 123456.78);
		// acc = new Account();
	}
}