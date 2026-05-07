class Order {
    public String productName;
    private double unitPrice;
    private int quantity;

    public Order(String productName, double unitPrice, int quantity) throws Exception {
        this.productName = productName;

        if (unitPrice <= 0) {
            throw new Exception("Unit price must be greater than zero.");
        }

        if (quantity <= 0) {
            throw new Exception("Quantity must be greater than zero.");
        }

        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) throws Exception {
        if (unitPrice <= 0) {
            throw new Exception("Unit price must be greater than zero.");
        }

        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) throws Exception {
        if (quantity <= 0) {
            throw new Exception("Quantity must be greater than zero.");
        }

        this.quantity = quantity;
    }

    public double calculateTotal() {
        return unitPrice * quantity;
    }
    public String toString() {
        return productName + " - " + quantity + " pcs x " + unitPrice + " = " + calculateTotal();
    }
}

public class Assesment3 {
    public static void main(String[] args) {
        System.out.println("--- Order Test ---");

        try {
            Order o1 = new Order("Gaming Mouse", 25.75, 3);
            Order o2 = new Order("Mechanical Keyboard", 120.0, 1);

            System.out.println(o1);
            System.out.println(o2);

            System.out.println("\n--- Invalid Order Attempt ---");

            Order o3 = new Order("Monitor", -50.0, 2);

            System.out.println(o3);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}