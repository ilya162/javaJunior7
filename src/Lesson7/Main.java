package Lesson7;

public class Main {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        int[] m = {1, 2, 34, 5};
        mo.addMass(m);


         int s = mo.summMass();
        System.out.println(s);
//        double avg = mo.avgMass();
//        int[] step = mo.stepMass(3);
//        int[] r = mo.revers();
        mo.print();
    }
}
