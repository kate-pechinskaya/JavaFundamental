package by.pev.unit2_Algorithmization;

public class ArraysOfArrays1 {
    /*1.	Дана матрица. Вывести на экран все нечетные столбцы,
     у которых первый элемент больше последнего. */
    public static void main(String[] args) {
        int n = 3; //строк
        int m = 5;//столбцов
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j % 2 == 0 && (matrix[0][j] > matrix[2][j])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
