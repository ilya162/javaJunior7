package lesson2;

public class DZ {
    public static void main(String[] args) {
// С помощью цикла For, напечатать на консоль:
//1) Только четные от -100 до -50
//2) Все числа в обратном порядке от 10 до 30
//3) Кол-во четных чисел в диапазоне от 30 до 61
//4) *** Посчитать сколько нужно лет, чтоб собрать сумму в 200т рублей, если откладывать ежемесячно по 9500
//5) Вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
//6) ** напечатать список платежей для кредита на 1 000 000 рублей, с процентной ставкой 11.8 процента, если я хочу взять на 3 года, 5 лет, 10 лет.
        for (int i = -100; i < -50; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
        for (int i = 30; i > 10; i--)
            System.out.println(i);

        int count = 0;
        for (int i = 30; i < 61; i++)
            if (i % 2 == 0) {
                count++;
            }
        System.out.println("Количество четных чисел" + count);
        int m = 0;
        for (int i = 0; i < 200000; i = i + 9500) {
            m++;
        }
        if (m % 12 == 0) {
            System.out.println(m / 12);
        } else {
            System.out.println("Нужно" + m / 12 + 1);
        }

        //int money1 = 9500;/// сколько лет, чтобы накопить 200000
        // int money2 = 200000;
        // double year1 = money1 * 12;
        //for (int i = 9500; i < 200000; i++)

        //  System.out.println(i);

        for (int i = 20; i < 60; i++) {
            if (i <= 29 || i >= 41) {
                System.out.println(i);
            }
        }
        //int credit = 10000000;
        //double proc = 11.8;
        // int year3 = 3;
        //int year5 = 5;
        //int year10 = 10;


    }
}
