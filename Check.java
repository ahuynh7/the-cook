package myRestaurant;

import java.text.NumberFormat;    // for making money easier to look at
								  // instead of $2.34000000000001, we get $2.34
public class Check {
	private double balance;
	private double tax = 1.05;
	private double total;
	private static NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public Check(double bal) {    // constructor
		getTotal(bal);
		
		balance = bal;
	}
	
	public void getTotal(double balance) {    // gets the total
		total = balance * tax;
	}
	
	public void printCheck() {	  // prints the check
		double taxed = balance * 0.05;
		
		money.format(taxed);
		System.out.printf("\n\n        BALANCE    %s\n            TAX    %s\n"
			+ "       +_________________\n\n"
			+ "          TOTAL    %s"
			+ "\n\n      THANK YOU! AND PLEASE COME AGAIN!", money.format(balance), money.format(taxed), money.format(total));
	}	 // ^ string concatenation ^
}
