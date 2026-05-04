
public class PassingParameters {

    public static void main(String[] args) {
        System.out.println("The 1st output is ");
        a("Computer", 5);
        System.out.println("The 2nd output is ");
        a("result", 15);
        //System.out.println("The output is " + a(5, system));
    }

    public static void a(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
