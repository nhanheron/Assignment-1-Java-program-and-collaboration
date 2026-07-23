/**
 * 
 * Grocery is a class that build a grocery management system using parallel
 * arrays, where the same index corresponds to the same item. There are three
 * main functions in the class, displaying the inventory, restocking items, 
 * and providing a user menu.
 * 
 * Group Members: Kelley Jenkins, Noah Pham
 * 
 * @author Kelley Jenkins, Noah Pham
 */
public class Grocery{

/**
 * Prints the item name, price, and stock quantity for each item
 * Skips any element in array that contains the null value
 *
 * @param names an array that holds the names of items
 * @param prices an array that holds the prices of items
 * @param stocks an array that hold the item stockpile
 */
public static void printInventory(String[] names, double[] prices, int[] stocks){
	for (int i = 0; i < names.length; i++){
	    if (names[i] != null){
	        System.out.println("\nItem Name: " + names[i]);
	        System.out.println("Item Price: " + prices[i]);
	        System.out.println("Item Stock: " + stocks[i]);
	    }
	}
}

/**
 * Searches for an item by name and adds the given amount to its stock
 * Prints the new stock total when the item is found
 * Prints "Item not found." when no element in array matches the target name
 *
 * @param names an array that holds the names of items
 * @param stocks an array that hold the item stockpile
 * @param target the name of the item to restock
 * @param amount the number of units to add to the item stock
 */
public static void restockItem(String[] names, int[] stocks, String target, int amount){
	boolean found = false;
	for (int i = 0; i < names.length; i++){
	    if (names[i] != null && names[i].equals(target)){
	        stocks[i] = stocks[i] + amount;
	        System.out.println("\nRestocked " + target);
	        System.out.println("New Stock: " + stocks[i]);
	        found = true;
	    }
	}
	if (!found){
	    System.out.println("\nItem not found.");
	}
}

}
