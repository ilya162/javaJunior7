package Lesson11;

public class Matrix implements IMatrix {
    //getRows/getColumns
    private double[][] arr;
    int i, j;

    public Matrix() {
        arr = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }


    public Matrix(int rows, int columns) {
        if (rows < DEFAULT_MATRIX_SIZE) rows = DEFAULT_MATRIX_SIZE;
        if (columns < DEFAULT_MATRIX_SIZE) columns = DEFAULT_MATRIX_SIZE;
        arr = new double[rows][columns];
    }

    public Matrix(double[][] arr) {
        this.arr = arr;
    }


    @Override
    public int getRows() {
        return arr.length;
    }


    @Override
    public int getColumns() {
        return arr[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            throw new IndexOutOfBoundsException("method getValueAt, rowIndex < 0 || rowIndex >= getRows()");
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            throw new IndexOutOfBoundsException("method getValueAt, colIndex < 0 || colIndex >= getColumns()");
        }
        return arr[rowIndex][colIndex];


    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            throw new IndexOutOfBoundsException("method getValueAt, rowIndex < 0 || rowIndex >= getRows()");
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            throw new IndexOutOfBoundsException("method getValueAt, colIndex < 0 || colIndex >= getColumns()");
        }
        arr[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix==null){
         throw new NullPointerException("method add,otherMatrix==null");
        }
         if (this.getRows()!=otherMatrix.getRows()||this.getColumns()!=otherMatrix.getColumns()){
             throw new IllegalArgumentException("method add,Размеры матриц должны быть одинаковыми");
         }

        Matrix res = new Matrix(getRows(), getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            int j;
            for (j = 0; j < this.getColumns(); j++) {
                res.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }

        }
        return res;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (otherMatrix==null){
            throw new NullPointerException("method sub,otherMatrix==null");
        }
        if (this.getRows()!=otherMatrix.getRows()||this.getColumns()!=otherMatrix.getColumns()){
            throw new IllegalArgumentException("method sub,Размеры матриц должны быть одинаковыми");
        }
        Matrix res = new Matrix(getRows(), getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (j = 0; j < this.getColumns(); j++) {
                res.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }

        }
        return res;

    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//                             getRows() | getColumns()
        // this -текущая матрица       A- ij,
        // otherMatrix- вторая матрица B- jk.
        // res-матрица                 С- ik.

        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Количество столбцов А не равно количеству строк В");
            return null;
        }
        IMatrix res = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int k = 0; k < otherMatrix.getColumns(); k++) {
                for (int j = 0; j < this.getColumns(); j++) {
                    double v = res.getValueAt(i, k) + this.getValueAt(i, j) * otherMatrix.getValueAt(j, k);
                    res.setValueAt(i, k, v);
                }
            }
        }
        return res;

    }


    @Override
    public IMatrix mul(double value) {
        Matrix res = new Matrix(getRows(), getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                res.setValueAt(i, j, (this.getValueAt(i, j) * value));

            }


        }

        return res;
    }

    @Override
    public IMatrix transpose() {
        Matrix res = new Matrix(getColumns(), getRows());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                res.setValueAt(j, i, (this.getValueAt(i, j)));


            }

        }
        return res;
    }

    @Override
    public void fillMatrix(double value) {
        Matrix res = new Matrix(getRows(), getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                arr[i][j] = value;

            }
        }
        return;

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j && arr[i][j] != 1)
                    return false;
                else if (i != j && arr[i][j] != 0)
                    return false;
            }
        }
        return true;
    }


    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getRows() != this.getColumns())
                    return false;
            }

        }
        return true;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < getRows(); i++) {
            int j;
            for (j = 0; j < getColumns(); j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    @Override
    public boolean isNullMatrix() {
        boolean b = true;

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (arr != null) {
                    return false;


                }
            }


        }

        return b;
    }
}






