
import java.util.Scanner;

public class Problem32 {

    public static void main() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println(a + ">" + b);
        }
        if (a < b) {
            System.out.println(a + "<" + b);
        }
        if (a != b) {
            System.out.println(a + "!=" + b);
        }
        if (a == b) {
            System.out.println(a + "==" + b);
        }
        if (a <= b) {
            System.out.println(a + "<=" + b);
        }
        if (a >= b) {
            System.out.println(a + ">=" + b);
        }
    }
}
