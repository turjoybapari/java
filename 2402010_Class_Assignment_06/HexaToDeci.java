
import java.util.*;

public class HexaToDeci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal number: ");
        String s = sc.next();
        System.out.println("Decimal value: " + con(s));
    }

    // This method converts a single character ('0'-'F') to its number value (0-15)
    public static int c(char b) {
        if (b >= 'A' && b <= 'F') {
            return b - 'A' + 10; //b=A mane 65 so 65-65+10=10 same jodi b=B mane 66-65+10=11
        } else {
            return b - '0'; //mane 1 theke 9  er moddhe value hole seta direct return kore dibe
        }
    }

    public static int con(String l) {
        int sum = 0;
        for (int i = 0; i < l.length(); i++) {
            int digitValue = c(l.charAt(i));
            /*
            (((A*16)+B)*16+c))*16+D 
             */
            sum = (sum * 16) + digitValue;
        }
        return sum;
    }
}
