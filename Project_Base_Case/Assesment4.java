import java.util.ArrayList;
import java.util.Scanner;

class Order {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Order(String productName, double unitPrice, int quantity) {
        if (unitPrice <= 0) {
            throw new IllegalArgumentException("Unit price must be greater than zero.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return productName + " - " + quantity + " pcs x " + unitPrice + " = " + calculateTotal();
    }
}

public class BaseCaseShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        System.out.println("--- Welcome to BaseCase Shop ---\n");
        System.out.print("How many items do you want to purchase? ");
        int numItems = scanner.nextInt();
        scanner.nextLine();

        if (numItems > 5) {
            numItems = 5;
            System.out.println("Maximum 5 items allowed. Setting to 5.");
        }

        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter Product " + (i + 1) + " Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            try {
                Order order = new Order(name, price, quantity);
                orders.add(order);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + " Skipping item.");
            }
        }

        double subtotal = 0;
        for (Order order : orders) {
            subtotal += order.calculateTotal();
        }

        double discountPercent;
        if (subtotal > 100) {
            discountPercent = 0.20;
        } else if (subtotal > 50) {
            discountPercent = 0.10;
        } else {
            discountPercent = 0.05;
        }

        double discountAmount = subtotal * discountPercent;
        double deliveryFee = (subtotal < 50) ? 10.0 : 0.0;
        double finalTotal = subtotal - discountAmount + deliveryFee;

        System.out.println("\n--- Final Receipt ---");
        int itemNumber = 1;
        for (Order order : orders) {
            System.out.println("Item " + itemNumber + ": " + order);
            itemNumber++;
        }

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount Applied (" + (int)(discountPercent * 100) + "%): " + discountAmount);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Final Total: " + finalTotal);
        System.out.println("--------------------------");

        scanner.close();
    }
}