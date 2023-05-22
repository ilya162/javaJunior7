package lesson2;

public class Main {
    public static void main(String[] args) {
        // вывести числа от 10 до 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 30; i <= 60; i++) {
            System.out.println(i);// от 30 до 60
        }
        for (int i = 30; i <= 60; i = i + 2) {
            System.out.println(i);// от 30 до 60, каждое второе число
        }
        // вывести числа в обратном порядке от 100 до 70 ,исключая 80-90
        for (int i = 100; i >= 70; i--) {
            if (i <= 80 || i >= 90) {
                System.out.println(i);
            }
        }
//вывести числа от 10 до 100 ,котрые делятся на 3 или 5
        for (int i = 10; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
        // посчитать количество делящихся на 3 и на 5 в диапазоне от 0 до 100
        int count3 = 0;
        int count5 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                count3++;
            }

            if (i % 5 == 0) {
                count5++;
            }

        }
        System.out.println("тройки = " + count3 + "пятерки = " + count5);
    }
}