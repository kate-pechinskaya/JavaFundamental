package by.pev.unit2_Algorithmization;

public class ArraysOfArrays3 {
    /*3.	Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        print(matrix);
        System.out.println();
        printKStringAndPColumn(1, 2, matrix);
    }

    public static int[][] createMatrix() {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = -2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 1;
        matrix[2][0] = 5;
        matrix[2][1] = 0;
        matrix[2][2] = 2;
        return matrix;
    }

    public static int[][] print(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static int[][] printKStringAndPColumn(int k, int p, int[][] matrix) {
        for (int i = 0; i < 2; i++) { //for String
            if (i == k)
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 3; i++) { //for Column
            for (int j = 0; j < 3; j++) {
                if (j == p) {
                    System.out.println(matrix[i][j]);
                }
            }
        }
        return matrix;
    }
}
