import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Hello World!"+age);
        System.out.print("Hello World!");
        System.out.println();
        System.out.print("Hello World!");
         input.close();
    }
}