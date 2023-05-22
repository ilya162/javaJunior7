package lesson3;

public class Main3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        // заполнить массив числами кратным 5
        // a[0] =0;
        // a[1] = 5;
        //a[2]= 10;
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 5;
            System.out.println(a[i]);
        }
        // заполнить числами как их индекс и посчитать количество кратных 7
        int schet = 0;
        int[] b = new int[100];
        for (int i = 0; i < b.length; i++) {
            b[i] = i;
            if (b[i] % 7 == 0) {
                schet++;
            }
        }
        System.out.println(schet);


        for (int i = b.length - 1; i >= 0; i--) { // заполнить числа в обратном порядке от индекса
            b[b.length - 1 - i] = i;

        }
        for (int i = 0; i < b.length; i++) {
            b[i] = b.length - 1 - i;
            System.out.println(b[i]);
        }
        int tmp = 99;
        for (int i = 0; i < b.length; i++) {
            b[i] = tmp;
            tmp--;
            System.out.println(b[i]);
        }
    }
}
