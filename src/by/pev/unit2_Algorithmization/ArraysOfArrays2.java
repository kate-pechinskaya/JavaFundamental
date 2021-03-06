package by.pev.unit2_Algorithmization;

public class ArraysOfArrays2 {
    /*2.	Дана квадратная матрица.
     Вывести на экран элементы, стоящие на диагонали. */

    public static void main(String[] args) {
        int[][] matrix = createMatrix();
        printMatrix(matrix);
        System.out.println();
        printDiagonal(matrix);
    }

    public static int[][] createMatrix() {
        int[][] matrix = new int[][]{{1,-2,3},{4,1,5},{5,0,2}};
        return matrix;
    }

    private static int[][] printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    private static int[][] printDiagonal(int[][] matrix) {
        String s = "  ";
        for (int i = 0; i < 3; i++) {
            {
                System.out.print(s + matrix[i][i] + " ");
                s += "  ";
            }
            System.out.println();
        }
        return matrix;
    }


}
