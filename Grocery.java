import java.util.Scanner;

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
 * Runs the grocery management system menu. Sets up the parallel arrays and
 * uses a Scanner with a while loop to let the user view the inventory,
 * restock an item, or exit the program.
 *
 * @param args command line arguments (not used)
 */
    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    int userInput;
	    String userItem;
	    int userAmount;
	    
	    String[] itemNames = new String[10];
	    double[] itemPrices = new double[10];
	    int[] itemStock = new int[10];
	    
	    while(true){
	        System.out.println("Enter in:\n" + 
	                           "1 - View Menu\n" +
                               "2 - Restock\n" +	
                               "3 - Exit\n");
                               
            userInput = keyboard.nextInt();
            
            if(userInput == 1){
                printInventory(itemNames, itemPrices, itemStock);
            }
            else if (userInput == 2){
                System.out.println("Enter in Item");
                userItem = keyboard.next();
                System.out.println("Enter in amount");
                userAmount = keyboard.nextInt();
                
                restockItem(itemNames, itemStock, userItem, userAmount);
            }
            else if (userInput == 3){
                System.out.println("Exiting");
                break;
            }
            else{
                System.out.print("Invalid! Enter in 1, 2, or 3!");
            }
	    }
		 keyboard.close();
	}
    
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
