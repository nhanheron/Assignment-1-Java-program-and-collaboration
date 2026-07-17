import java.util.Scanner;

/**
 * Task 3: The User Menu
 * Runs the grocery management system menu and calls inventory display and
 * restock methods based on user input.
 *
 * Group members: Noah Pham, Kelly Jenkins
 *
 * @version 1.0
 */
public class GroceryMenu {

    /**
     * Private constructor; this utility class is not meant to be instantiated.
     */
    private GroceryMenu() {
    }

    /**
     * Starts the grocery management menu. Users can view inventory, restock
     * an item, or exit the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        // Sample grocery data for testing
        itemNames[0] = "Apple";
        itemPrices[0] = 0.99;
        itemStocks[0] = 50;

        itemNames[1] = "Banana";
        itemPrices[1] = 0.59;
        itemStocks[1] = 40;

        itemNames[2] = "Milk";
        itemPrices[2] = 3.49;
        itemStocks[2] = 20;

        itemNames[3] = "Bread";
        itemPrices[3] = 2.99;
        itemStocks[3] = 15;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Grocery Management Menu");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                InventoryDisplay.printInventory(itemNames, itemPrices, itemStocks);
            } else if (choice == 2) {
                System.out.print("Enter item name to restock: ");
                String target = scanner.nextLine();
                System.out.print("Enter amount to add: ");
                int amount = scanner.nextInt();
                scanner.nextLine(); // consume newline
                RestockItem.restockItem(itemNames, itemStocks, target, amount);
                System.out.println();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.\n");
            }
        }

        scanner.close();
    }
}
