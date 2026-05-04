import java.util.Scanner;
public class Problem7 {

    public static void main() {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int b=1;
        while(b!=11){
            System.out.println(a*b);
            b++;
        }
    }
}
