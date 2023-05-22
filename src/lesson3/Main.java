package lesson3;

public class Main {
    public static void main(String[] args) {
        int[] mass = {1, 34, 56, 645, 545, 455, 545, 5544, 5455, 3, 36,};
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ", ");
        }
        System.out.println();
        for (int i = mass.length - 1; i >= 0; i = i - 2) { // v obratnom poryadke cherez 1
            System.out.print(mass[i] + ", ");

        }
        System.out.println();
        for (int i = mass.length - 1; i >= 0; i--) {
            if ((mass.length - 1) % 2 == 0) {
                if (i % 2 == 0) {
                    System.out.print(mass[i] + ", ");
                }
            } else {
                if (i % 2 != 0) {
                    System.out.print(mass[i] + ", ");
                }
            }
        }
        System.out.println();
        boolean b = true;
        for (int i = mass.length - 1; i >= 0; i--) {
            if (b) {
                System.out.print(mass[i] + ", ");
                b = false;
            } else {
                b = true;
            }
        }
    }
}


