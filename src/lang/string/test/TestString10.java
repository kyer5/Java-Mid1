package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String joinedString = String.join("->", fruits.split(","));
        System.out.println("joinedString = " + joinedString);
    }
}
