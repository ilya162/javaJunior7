package lesson1;

public class DZ {
    public static void main(String[] args) {
        // 1000 руб
        // Пицца 135 булочка 78 жвачка 3 руб
        // Купить максимум пицц, на остаток булочек и жевачек
        int money = 1000;
        int p = 135;
        int b = 78;
        int j = 3;
        int collp = money / p;
        int ost1 = money % p;
        int collb = 0;
        int ost2 = 0;
        int collj = 0;
        int ost3 = 0;
        if (ost1 > b) {
            collb = ost1 / b;
            ost2 = collb % b;
            collj = ost2 / j;
            ost3 = collj % j;
        } else {
            collj = ost1 / j;
            ost3 = ost1 % j;
        }
        System.out.println(" количество пицц " + collp + " остаток " + ost1 + " количество булочек " + collb + " остаток " + ost2 + " оличество жевачек " + collj + " остаток " + ost3);
        int a = 5478;
        if (a > 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        int year = 3;
        int summ = 300000;
        int proc = 10;
        double year1 = summ + (summ * proc / 100.0);
        double year2 = year1 + (year1 * proc / 100.0);
        double year3 = year2 + (year2 * proc / 100.0);
        System.out.println(year3);

        int c = 6;
        int e = 10;
        int square = 1 / 2 * c * e;
        System.out.println("Площадь треугольника" + square);

        int r = 12;
        int h = 5;
        double v = Math.PI * r * r * h;

    }
}
