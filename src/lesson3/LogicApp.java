package lesson3;

public class LogicApp {
    public static void main(String[] args) {

        // или = || |
        // и =  && &
        // не = !
        int a = 0;
        if (isPositive(a) && !izZero(a)) {
            System.out.println("положительно и не 0");
        }
        if (!isPositive(a) || izZero(a)) {
            System.out.println();
        }
    }

    public static boolean isPositive(int val) {
        return val >= 0;

    }

    public static boolean izZero(int val) {
        return val == 0;
    }
}
