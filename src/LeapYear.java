public class LeapYear {
    public static void main(String[] args) {
        int y = 2024;
        isLeapYear(y);
    }

    private static void isLeapYear(int y) {
        if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
            System.out.println(y + " is a leap year");
        } else {
            System.out.println(y + " is not leap year");
        }
    }
}
