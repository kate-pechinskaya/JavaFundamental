package by.pev.unit2_Algorithmization;

public class Arrays6 {
    /*6.	Задана последовательность N вещественных чисел.
    Вычислить сумму чисел, порядковые номера которых являются
    простыми числами. */
    public static void main(String[] args) {
        int n = 100;
        int[] array = new int[n];
        int sum = 0;
        //заполнение массива
        for (int i = 2; i < array.length; i++) {
            array[i] = i;
            if (isPrimeNumber(i)) {
                System.out.print(array[i] + " ");
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println(sum);
    }

    private static boolean isPrimeNumber(int number) {
        boolean check = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
