// THERE WILL BE MORE DISHES IN THE FUTURE.

package myRestaurant;

import java.util.Scanner;
import static java.lang.System.out;    // imports

public class Restaurant {
	public static void intro() {	// introduction string method
		out.println("       _________________________"); 
		out.println("       |Welcome to Anh's Diner!|");
		out.println("       -------------------------");	// aesthetics
		out.println("\n                =MENU=          ");
	}
	
	public static void main(String arg[]) {
		Restaurant.intro();    // calls method
		
		Scanner inp = new Scanner(System.in);	// declares Scanner
		Menu order = new Menu(0); 	 // new object for the menu
		double truBal = 0.0;	// balance var in the main class
		int orders;    
		String areYouDone;	  // vars for error handling
		
		out.print("\n\n  What would you like to order? (Enter the dish number) ");
			
		while (true) {	  // error handling loop
			orders = inp.nextInt();    // first input instance
				
			if (orders <= order.getTotalDishes() && orders > 0) {    // for the user to put in correct dish number
				order = new Menu(orders);    // object that retreives info from the menu
				
				truBal += order.getBalance();    // adds to the balance var
				out.print("\n\n  Are you done ordering? (Y / N) ");
				
				areYouDone = inp.next();
					
				if (areYouDone.toLowerCase().equals("y")) {
					break;    // breaks from loop
				}
			}
		}
		
		Check bill = new Check(truBal);    // object for check class
		
		bill.printCheck();	  // PRINTS ENTIRE CHECK
		inp.close();	// closes the scanner
	}
}
