//written by Tom
import java.util.*;
import java.io.*;

public class Account {
	private String name;
	private double balance;
	private static int nextID;
	int acctID;

	Account(String n, double bal) {
	    init();
		this.name = n;
		this.balance = bal;
		print();
	}

	Account () {
        init();
		Scanner in = new Scanner(System.in);
		System.out.print("Account name? ");
		this.name = in.nextLine();
      	System.out.print("Initial balance? ");
        this.balance = in.nextDouble();
        in.close();
        print();
	}

	/**
	 * Common code for each constructor, ensuring each account object has a unique acctID
	 */
	void init() {
		this.acctID = nextID++;
	}
	
	// Print the balance of this account
	public void print() {
		System.out.println("Account " + acctID + " - " + this.name + " has a balance of $" + this.balance);
	}

}