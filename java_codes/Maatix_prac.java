import java.util.Scanner;

class Matrix {
    int row, column;
    float[][] mat;

    Matrix(int a[][]) {
        this.row = a.length;
        this.column = a[0].length;
        this.mat = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                this.mat[i][j] = a[i][j];
            }
        }
    }

    Matrix() {
        this.row = 0;
        this.column = 0;
        this.mat = new float[row][column];
    }

    Matrix(int row, int col) {
        this.row = row;
        this.column = col;
        this.mat = new float[row][column];
    }

    void readMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = sc.nextFloat();
            }
        }
    }

    float[][] transpose() {
        float[][] transposed = new float[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposed[j][i] = mat[i][j];
            }
        }
        return transposed;
    }

    float[][] matrixMultiplication(Matrix second) {
        if (this.column != second.row) {
            throw new IllegalArgumentException("Matrix multiplication not possible");
        }
        float[][] result = new float[this.row][second.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < second.column; j++) {
                for (int k = 0; k < this.column; k++) {
                    result[i][j] += this.mat[i][k] * second.mat[k][j];
                }
            }
        }
        return result;
    }

    void displayMatrix(float[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    void displayMatrix() {
        displayMatrix(this.mat);
    }

    float maximum_of_array() {
        float max = mat[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }
        return max;
    }

    float average_of_array() {
        float sum = 0;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum += mat[i][j];
                count++;
            }
        }
        return sum / count;
    }
}

public class Maatix_prac {
    public static void main(String[] args) {
        int arr1[][] = {{1, 2, 2, 4, 5}, {4, 5, 4, 5, 5}, {458, 415, 45, 1, 25}};
        Matrix m1 = new Matrix(arr1);
        Matrix m2 = new Matrix(3, 5);
        Matrix m3 = new Matrix();

        m2.readMatrix();

        System.out.println("Matrix 1:");
        m1.displayMatrix();

        System.out.println("Matrix 2:");
        m2.displayMatrix();

        System.out.println("Transpose of Matrix 1:");
        float[][] transposed = m1.transpose();
        m1.displayMatrix(transposed);

        System.out.println("Matrix Multiplication of Matrix 1 and Matrix 2:");
        try {
            float[][] multiplied = m1.matrixMultiplication(m2);
            m1.displayMatrix(multiplied);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Maximum of Matrix 1: " + m1.maximum_of_array());
        System.out.println("Average of Matrix 1: " + m1.average_of_array());
    }
}