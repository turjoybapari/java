
class DB {

    static String url;

    static {
        url = "jdbc:mysql://localhost:3306/db";
        System.out.println("Static Block: Config Loaded");
    }

    DB() {
        System.out.println("Constructor: Object Created");
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("URL: " + DB.url); // Object charai access

        new DB();
        new DB();
    }
}
