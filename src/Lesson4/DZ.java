package Lesson4;

public class DZ {
    public static void main(String[] args) {
        int[][] q = new int[9][9];
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                if (i == j)
                    System.out.print(q[i][j] + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q.length; j++) {
                if (j == q[i].length - 1 - i)
                    System.out.print(q[i][j] + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q.length; j++) {
                if (j == q[i].length / 2 || i == q[i].length / 2)
                    System.out.print(q[i][j] + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        int a = q.length / 2;
        int b = q.length / 2;
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[0].length; j++) {
                if (j >= a && j <= b) {
                    System.out.print(" *");
                } else {
                    System.out.print(" 0");
                }
            }
            if (i >= q.length / 2) {
                a++;
                b--;
            } else {
                a--;
                b++;
            }
            System.out.println();
        }
        boolean on = true;
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[0].length; j++) {
                if (on) {
                    System.out.print("* ");
                    on = false;
                } else {
                    System.out.print("0 ");
                    on = true;
                }
            }
            System.out.println();
        }
    }
}


