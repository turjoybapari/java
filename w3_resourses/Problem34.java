
import java.util.Scanner;

public class Problem34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon: ");
        int s = sc.nextInt();
        double a = (6 * s * s) / (4 * Math.tan(3.1416 / 6));
        System.out.println("The area of the hexagon is: ");
        System.out.println(a);
    }
}
