package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public static void printRange(int number) {
        switch (number) {
            case 1, 2, 3, 4, 5 ->
                    System.out.println("number is between 1 and 5");
            case 6, 7, 8, 9, 10 ->
                    System.out.println("number is between 6 and 10");
            default -> System.out.println("out of range");
        }
    }

    public static void main(String[] args) {
        printRange(2);
        printRange(0);
    }
}
