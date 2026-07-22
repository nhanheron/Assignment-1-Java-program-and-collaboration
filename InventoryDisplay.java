/**
 * Task 1: Inventory Display.
 *
 * Holds the method that prints the current grocery inventory using
 * parallel arrays (names, prices, stocks).
 *
 * Branch: feature-display
 *
 * @author Your Name
 */
public class InventoryDisplay {

    /**
     * Prints every non-empty slot in the inventory.
     *
     * Iterates through the parallel arrays and uses an if-else statement
     * to only print slots that actually contain an item.
     *
     * @param names  the array of item names
     * @param prices the array of item prices
     * @param stocks the array of item stock counts
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("----- Inventory -----");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(i + ": " + names[i]
                        + " | Price: $" + prices[i]
                        + " | Stock: " + stocks[i]);
            } else {
                // Empty slot, skip it.
            }
        }
        System.out.println("---------------------");
    }
}
