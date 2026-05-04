
public class RandomCharacter {

    public static void main(String[] args) {
        // 1. Generate a random number between 0 and 65535
        int randomUnicode = (int) (Math.random() * (65535 + 1));
        // 2. Cast the integer to a char
        char randomChar = (char) randomUnicode;
        // Output the results
        System.out.println("Random Unicode Value: " + randomUnicode);
        System.out.println("Corresponding Character: " + randomChar);
    }
}
