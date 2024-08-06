package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("new String() == 비교: " + (str1 == str2)); // 참조값을 비교
        System.out.println("new String() equals 비교: " + (str1.equals(str2))); // value 값을 비교, String의 equals는 overidding된 메서드 기능

        String str3 = "hello"; // x003
        String str4 = "hello"; // x004
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
