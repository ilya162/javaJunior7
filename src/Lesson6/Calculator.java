package Lesson6;

public class Calculator {
    // умножение
    // деление
    //вычитание
    //сумма
    public static int mul(int a, int b) {
        int res = a * b;
        return res;

    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static double del(int a, int b) {
        if (b == 0) {
            System.out.println("На 0 делить нельзя");
            return 0;
        }
        double t = a;
        double del = t / b;
        return del;
    }
}
