/**
 * Task 1: Inventory Display
 * Prints grocery inventory from parallel arrays, skipping empty slots.
 *
 * Group members: [Your Name], [Partner Name]
 *
 * @author [Your Name], [Partner Name]
 * @version 1.0
 */
public class InventoryDisplay {

    /**
     * Private constructor; this utility class is not meant to be instantiated.
     */
    private InventoryDisplay() {
    }

    /**
     * Prints all non-empty inventory slots, showing each item's name, price,
     * and stock amount.
     *
     * @param names  array of item names
     * @param prices array of item prices
     * @param stocks array of item stock counts
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("\n--- Inventory ---");
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println((i + 1) + ". " + names[i]
                        + " | Price: $" + prices[i]
                        + " | Stock: " + stocks[i]);
                found = true;
            } else {
                // empty slot — skip printing
            }
        }

        if (!found) {
            System.out.println("Inventory is empty.");
        }
        System.out.println("-----------------\n");
    }
}
