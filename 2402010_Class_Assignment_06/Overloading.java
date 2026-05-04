
import java.util.Scanner;

public class Overloading {

    public static void main(String[] args) {
        System.out.println("Enter your numbers ");
        Scanner b = new Scanner(System.in);
        int a = b.nextInt();
        int c = b.nextInt();
        System.out.println(max(a, c));

    }

    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
