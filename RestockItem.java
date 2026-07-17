/**
 * Task 2: Restock and Search
 * Finds an item by name in parallel arrays and increases its stock.
 *
 * Group members: [Your Name], [Partner Name]
 *
 * @author [Your Name], [Partner Name]
 * @version 1.0
 */
public class RestockItem {

    /**
     * Private constructor; this utility class is not meant to be instantiated.
     */
    private RestockItem() {
    }

    /**
     * Searches for an item by name and adds the given amount to its stock.
     * If the item is not found, prints "Item not found."
     *
     * @param names  array of item names
     * @param stocks array of item stock counts
     * @param target the name of the item to restock
     * @param amount the number of units to add to stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println("Restocked " + names[i] + ". New stock: " + stocks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }
}
