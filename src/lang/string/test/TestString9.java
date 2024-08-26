package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] ID = email.split("@");
        System.out.println("ID: " + ID[0]);
        System.out.println("Domain: " + ID[1]);
    }
}
