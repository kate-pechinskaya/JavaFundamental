package by.pev.unit2_Algorithmization;

import java.util.Arrays;

public class Arrays8 {
    /*8.	Дана последовательность целых чисел
a1, a2,... an . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a1, a2 ,... an ) . */
    public static int[] array = new int[]{3, 2, 4, 1, 8, 1, 9, 10};

    public static void main(String[] args) {
        System.out.println(newArray(array));
    }

    public static Object newArray(int[] array) {
        int min = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                count++;
            }
        }
        System.out.println(min);
        int[] array2 = new int[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                array2[index] = array[i];
                index++;
            }
        }
        return Arrays.toString(array2);
    }
}
