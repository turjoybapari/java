
import java.util.Scanner;

public class Problem33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 0;
        while (a != 0) {
            int x = a % 10;
            i += x;
            a = a / 10;
        }
        System.out.println(i);
    }
}
