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

}
