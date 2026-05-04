
import java.util.Scanner;

public class Problem35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon: ");
        int n = sc.nextInt();
        System.out.println("Input the length of one of the sides: ");
        int s = sc.nextInt();
        double a = (n * s * s) / (4 * Math.tan(3.1416 / n));
        System.out.println("Area of a polygon = " + a);
    }
}
