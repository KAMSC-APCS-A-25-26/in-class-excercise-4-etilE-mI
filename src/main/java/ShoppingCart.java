import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        // TODO: Use a for loop to read each item's price (double)
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input

        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.print("How many items are you purchasing? ");
        int itemCount = scanner.nextInt();

        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Price of item " + i + "? ");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.printf("Your cart has %d items with a total cost of $%.2f%n", itemCount, total);
    }
}
