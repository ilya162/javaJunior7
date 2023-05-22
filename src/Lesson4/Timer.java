package Lesson4;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введите количество минут для таймера");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        min = min - 1;
        for (; min >= 0; min--) {
            for (int sec = 59; sec >= 0; sec--) {
                System.out.println("Осталось: " + min + "минут, " + sec + "секунд");
                Thread.sleep(1000);
            }
        }
        System.out.println("Boom");
    }
}
