//Name = Gauree Manoj Dikkatwar.
//Class = SY-CSe-A
//Roll No. = 137

import java.util.Scanner;

public class RetailSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalRetailValue = 0.0; // Accumulate total sales
        int productNumber;
        int quantity;

        System.out.println("Enter product number (1–5) and quantity sold.");
        System.out.println("Enter 0 as the product number to finish.\n");

        // Input loop
        while (true) {
            System.out.print("Enter product number (1–5, or 0 to quit): ");
            productNumber = input.nextInt();

            // Sentinel value to stop
            if (productNumber == 0) {
                break;
            }

            System.out.print("Enter quantity sold: ");
            quantity = input.nextInt();

            double price = 0.0;

            // Determine price based on product number
            switch (productNumber) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number! Please enter a number between 1 and 5.");
                    continue; // Skip to next iteration
            }

            // Calculate total for this product
            double productTotal = price * quantity;
            totalRetailValue += productTotal;

            System.out.printf("Product %d total: $%.2f\n\n", productNumber, productTotal);
        }

        // Display total retail value
        System.out.printf("\nTotal retail value of all products sold: $%.2f\n", totalRetailValue);

        input.close();
    }
}

/*OUTPUT:
Enter product number (1-5, or 0 to quit):  6
Enter quantity sold: 5
Invalid product number! Please enter a number between 1 and 5.
Enter product number (1-5, or 0 to quit): 5
Enter quantity sold: 6
Product 5 total: $41.22
 */