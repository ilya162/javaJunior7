package Lesson5;

public class DZ {
    public static void main(String[] args) {

        int[][] q = new int[9][9];

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
        System.out.println();

            for (int i = 0; i < q.length; i++) {
                for (int j = 0; j < q[0].length; j++) {
                    if (j % 2 == 0)

                        System.out.print("* ");

                    else
                        System.out.print("0 ");

                }
                System.out.println();
            }
        System.out.println();
            for (int i = 0; i < q.length; i++) {
                for (int j = 0; j < q[0].length; j++) {
                    if (i % 2 == 0)

                        System.out.print("* ");

                    else
                        System.out.print("0 ");

                }
                System.out.println();

            }
        System.out.println();
            for (int i = 0; i < q.length; i++) {
                for (int j = 0; j < q[0].length; j++) {
                    if (i % 2 == 0 || j % 2 == 0)

                        System.out.print("* ");

                    else
                        System.out.print("0 ");

                }
                System.out.println();

            }
        System.out.println();
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


        }
    }



