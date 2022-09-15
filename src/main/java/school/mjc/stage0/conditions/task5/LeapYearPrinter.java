package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        boolean leapOrNot = ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0)));
        int remainder = leapOrNot ? 0 : 1;
        switch (remainder) {
            case 0:
                System.out.println("leap");
                break;
            case 1:
                System.out.println("not leap");
                break;
        }
    }

    public static void main(String[] args) {
        isLeapYear(2022);
        isLeapYear(2021);
        isLeapYear(2024);
    }
}
