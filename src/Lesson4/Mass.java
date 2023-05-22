package Lesson4;

public class Mass {
    public static void main(String[] args) {
        int[] m = new int[10];
        int[][] mass = new int[10][4];
        mass[2][1] = 99;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }

    }
}
