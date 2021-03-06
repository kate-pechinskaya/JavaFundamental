package by.pev.unit2_Algorithmization;

public class ArraysOfArrays6 {
    /*6.	Сформировать квадратную матрицу порядка
     n по заданному образцу(n - четное):
      1   1    1  ... 1  1  1
      0   1    1  ... 1  1  0
      0   0    1  ... 1  0  0
      .   .    .  ... .  .  .
      .   .    .  ... .  .  .
      .   .    .  ... .  .  .
      0   1    1  ... 1  1  0
      1   1    1  ... 1  1  1
      */

    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = i; j < arr.length - i; j++) {
                arr[i][j] = 1;
                arr[arr.length - i - 1][j] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}