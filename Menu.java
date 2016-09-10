/*
 * TEMPLATE FOR MAKING A NEW DISH/DRINK
 * 
public void () {
	price = .;
	itemNum = ;
	dishName = "";
	description = ".";
	balance += price;
		
	System.out.printf("\n    %d.) %s (%s$) - %s", itemNum, dishName, price, description);
}
*
*/

package myRestaurant;

public class Menu {
	private double balance = 0.0;
	private double price = 0;
	private int totalDishes = 5;    // subject to changing when new dishes are added
	private int itemNum;
	private String dishName;
	private String description;    // all the properties for the food
	
	public Menu(int items) {    // constructor for each dish (needs to be edited when adding more dishes)
		switch (items) {
		case 1:
			caliSteak();
			break;
			
		case 2:
			caesarSalad();
			break;
		
		case 3:
			creamySplit();
			break;
			
		case 4:
			goldenTea();
			break;
			
		case 5:
			berrySmoothie();
			break;
			
		case 0:
			caliSteak();
			caesarSalad();
			creamySplit();
			goldenTea();
			berrySmoothie();
			break;
		}
	}
	
	public int getTotalDishes() {    // returns the number of dishes in the menu
		return totalDishes;
	}
	
	public double getBalance() {    // returns the current object's balance
		return balance;
	}
	
	// BELOW WILL BE ALL THE DISHES
	
	public void caliSteak() {    // 1
		price = 9.59;
		itemNum = 1;
		dishName = "Cali Steak";
		description = "A seasoned, mushroom sauteed t-bone with a side of rice.";
		balance = price;
		
		System.out.printf("\n    %s.) %s (%s$) - %s", itemNum, dishName, price, description);
	}
	
	public void caesarSalad() {	   // 2
		price = 6.99;
		itemNum = 2;
		dishName = "Caesar Salad";
		description = "The ultimate salad drizzled with balsamic vinegar.";
		balance = price;
		
		System.out.printf("\n    %d.) %s (%s$) - %s", itemNum, dishName, price, description);
	}
	
	public void creamySplit() {    // 3
		price = 4.99;
		itemNum = 3;
		dishName = "Creamy Split";
		description = "Vanilla-like banana split with two cherries on top.";
		balance = price;
		
		System.out.printf("\n    %d.) %s (%s$) - %s", itemNum, dishName, price, description);
	}
	
	public void goldenTea() {    // 4
		price = 2.49;
		itemNum = 4;
		dishName = "Golden Tea";
		description = "Iced lemonade tea.";
		balance = price;
		
		System.out.printf("\n    %d.) %s (%s$) - %s", itemNum, dishName, price, description);
	}
	
	public void berrySmoothie() {    // 5
		price = 3.19;
		itemNum = 5;
		dishName = "Berry Smoothie";
		description = "Cold smoothie include kiwi, strawberry, and raspberry.";
		balance = price;
		
		System.out.printf("\n    %d.) %s (%s$) - %s", itemNum, dishName, price, description);
	}
}