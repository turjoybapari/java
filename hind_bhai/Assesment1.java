
import java.util.Scanner;

public class Assesment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Name: ");
        String product = sc.nextLine();
        System.out.println("Enter Unit Price: ");
        double u = sc.nextDouble();
        System.out.println("Enter Quantity: ");
        int q = sc.nextInt();
        final double dis = .15;
        double subtotal = u * q;
        double discount = subtotal * dis;
        double f_price = subtotal - discount;
        System.out.println("---Final Recipt---");
        System.out.println("Item: " + product);
        System.out.println("Subtotal:$" + subtotal);
        System.out.println("Discount Applied:$" + discount);
        System.out.println("Total(Rounded Down):$" + (int) f_price);
    }
}
