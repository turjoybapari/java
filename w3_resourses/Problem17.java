import java.util.Scanner;
public class Problem17{
    public static void main(String []args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
          while (b != 0) {
            int sum = a ^ b;          
            int carry = (a & b) << 1; 
            a = sum;
            b = carry;
        }
    }
    System.out.println(a);
}