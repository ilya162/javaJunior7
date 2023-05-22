package Lesson7;

public class MathOperations {
    private int[] mass;
    private int colZapis=0;

    public void addMass(int[] arr) {
        if (colZapis<3) {
            mass = arr;
            colZapis++;
        }else {
            System.out.println("Количество записей превысило норму");
        }

    }

    public int[] getMass() {
        return mass;
    }
//    public void addMass(int[]arr){
//        if ()

    public void print() {
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }

    }

    public int summMass() {
        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            summ += mass[i];

        }
        return summ;
    }
}



