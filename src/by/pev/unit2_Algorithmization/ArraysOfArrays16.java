package by.pev.unit2_Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysOfArrays16 {
    /*16.	Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3:
6  1 8
7  5 3
2  9 4 */
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];
        matrix[0][0] = 0;
        matrix[0][1] = 2;
        matrix[0][2] = 4;
        int max = matrix[0][0] + matrix[0][1] + matrix[0][2];
        matrix[1][1] = max / 3;
        matrix[2][2] = max - matrix[1][1] - matrix[0][0];
        matrix[1][2] = max - matrix[0][2] - matrix[2][2];
        matrix[1][0] = max - matrix[1][1] - matrix[1][2];
        matrix[2][0] = max - matrix[1][1] - matrix[0][2]; //=0
        matrix[2][1]= max- matrix[1][1]- matrix[0][1];
        print(matrix);
    }

    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
