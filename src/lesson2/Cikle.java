package lesson2;

public class Cikle {
    public static void main(String[] args) {
        int year = 3;
        double summ = 300000;
        int proc = 10;
        //summ = summ + (summ * 10 / 100.0);
        //summ = summ + (summ * 10 / 100.0);
        //summ = summ + (summ * 10 / 100.0);
        // System.out.println(summ);

        for (int i = 0; i < year; i++) {
            summ = summ + (summ * proc / 100.0);
        }
        System.out.println(summ);
    }


}

