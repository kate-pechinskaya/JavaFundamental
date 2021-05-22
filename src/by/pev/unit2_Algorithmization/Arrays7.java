package by.pev.unit2_Algorithmization;

public class Arrays7<maxSum> {
    /* 7.	Даны действительные числа a1, a2 ,..., an . Найти
max( a1+a2n , a2+a2n-1... an+ an+1 ) .
 * Просуммировать первый элемент с последним, второй с предпоследним и т.д.
 И вот среди этих сумм выбрать наибольшую.*/
    public static void main(String[] args) {
        int[] array = new int[11];
        //заполнение массива
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30));
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int maxSum = 0;
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int sum = array[i] + array[j];
            j--;
            System.out.println(sum);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("maxSum: " + maxSum);
    }
}