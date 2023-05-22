package Lesson11;

public class DZ {
    public static void main(String[] args) {


        Matrix m1 = new Matrix(5, 5);
        Matrix m2 = new Matrix(5, 5);
        System.out.println(m1.getRows());
        System.out.println(m1.getColumns());

        m1.setValueAt(2, 2, 8);
        m1.setValueAt(0, 1, 7);
        m1.setValueAt(1, 1, 8);
        m1.setValueAt(1, 3, 7);

        m2.setValueAt(2, 2, 8);
        m2.setValueAt(0, 1, 7);


        m1.printToConsole();
        System.out.println();
        m2.printToConsole();
        System.out.println();
        var m3 = m1.add(m2);
        m3.printToConsole();
        System.out.println();
        var m4 = m1.sub(m2);
        m4.printToConsole();
        System.out.println();




        double[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        double[][] arr2 = {
                {7, 8},
                {9, 1},
                {2, 3}
        };
        Matrix matrix1 = new Matrix(arr1);
        Matrix matrix2 = new Matrix(arr2);
        matrix1.printToConsole();
        System.out.println();
        matrix2.printToConsole();
        System.out.println();
        IMatrix mul = matrix1.mul(matrix2);
        mul.printToConsole();
        System.out.println();

        var m5 = m1.mul(3.0);
        m5.printToConsole();
        System.out.println();
        var m6 =m1.transpose();
        m6.printToConsole();
        System.out.println();
         m1.fillMatrix(2.5);
        m1.printToConsole();
        System.out.println();
        m1.isNullMatrix();
        System.out.println(m1.isNullMatrix());
        System.out.println();
        m1.isIdentityMatrix();
        System.out.println(m1.isIdentityMatrix());
        System.out.println();
        m1.isSquareMatrix();
        System.out.println(m1.isSquareMatrix());

    }
    }

