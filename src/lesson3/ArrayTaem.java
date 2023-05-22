package lesson3;

public class ArrayTaem {
    public static void main(String[] args) {
        int[] mass = new int[500];
        mass[2] = 42;

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
