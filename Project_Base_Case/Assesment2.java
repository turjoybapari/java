
import java.util.Scanner;

public class Assesment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items do you want to purchase?");
        int n = sc.nextInt();
        sc.nextLine();
        if (n > 5) {
            n = 5;
        }
        String[] products = new String[n];
        double[] prices = new double[n];
        int[] quantities = new int[n];
        double[] itemtotal = new double[n];
        double subtotal = 0;
        double discount;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter product " + (i + 1) + " Name: ");
            products[i] = sc.nextLine();

            System.out.print("Enter product " + (i + 1) + " Price: ");
            prices[i] = sc.nextDouble();
            while (prices[i] <= 0) {
                System.out.println("Error: Price must be greater than 0");
                System.out.print("Enter product " + (i + 1) + " Price: ");
                prices[i] = sc.nextDouble();
            }

            System.out.print("Enter product " + (i + 1) + " Quantities: ");
            quantities[i] = sc.nextInt();
            while (quantities[i] <= 0) {
                System.out.println("Error: Quantity must be greater than 0");
                System.out.print("Enter product " + (i + 1) + " Quantities: ");
                quantities[i] = sc.nextInt();
            }
            sc.nextLine();

            itemtotal[i] = prices[i] * quantities[i];
            subtotal += itemtotal[i];
        }
        if (subtotal > 100) {
            discount = .2;
        } else if (subtotal > 50) {
            discount = .1;
        } else {
            discount = .05;
        }
        int delivery = (subtotal < 50) ? 10 : 0;
        double d = discount * subtotal;
        double f = subtotal - d + delivery;
        System.out.println("--- Final Receipt ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Item " + (i + 1) + ": " + products[i] + " - " + quantities[i] + " x $" + prices[i] + " = $" + itemtotal[i]);
        }
        System.out.println("Subtotal: $" + (int) subtotal);
        System.out.println("Discount: $" + (int) d);
        System.out.println("Delivery Fee: $" + (int) delivery);
        System.out.println("Final Total: $" + (int) f);
    }
}
