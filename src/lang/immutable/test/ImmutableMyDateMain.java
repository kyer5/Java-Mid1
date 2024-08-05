package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate immutableMyDate1 = new ImmutableMyDate(2003, 5, 5);
        ImmutableMyDate immutableMyDate2 = immutableMyDate1;
        System.out.println("immutableMyDate1 = " + immutableMyDate1);
        System.out.println("immutableMyDate2 = " + immutableMyDate2);

        System.out.println("2025 -> date1");
        immutableMyDate1 = immutableMyDate1.withYear(2025);
        System.out.println("immutableMyDate1 = " + immutableMyDate1);
        System.out.println("immutableMyDate2 = " + immutableMyDate2);
    }
}
