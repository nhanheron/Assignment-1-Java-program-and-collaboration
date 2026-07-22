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
import java.util.Scanner;
public class Grocery{

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

public static void restockItem(String[] names, int[] stocks, String target, int amount){
	    for ( int i = 0; i < names.length; i++ ){
	        if ( names[i] != null && names[i].equals(target) ){
	            stocks[i] += amount;
	            return;
	        }
	    }
	    
	    System.out.println("Item Not Found.");
	}

}
