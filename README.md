# Assignment-1-Java-program-and-collaboration
Collaborate as a team to build a grocery management system using parallel arrays




/**
 * Prints the item name, price, and stock quantity for each item
 * Skips any element in array that contains the null value
 *
 * @param names an array that holds the names of items
 * @param prices an array that holds the prices of items
 * @param stocks an array that hold the item stockpile
*/
public static void printInventory(String[] names, double[] prices, int[] stocks){
	    for ( int i = 0; i < names.length; i++ ){
	        if ( names[i] != null ){
	            System.out.println("\nItem Name:" + names[i]);
	            System.out.println("Item Price:" + prices[i]);
	            System.out.println("Item Stock:" + stocks[i]);
	        }
	    }
	}