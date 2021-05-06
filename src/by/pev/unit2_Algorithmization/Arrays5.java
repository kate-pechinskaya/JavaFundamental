package by.pev.unit2_Algorithmization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays5 {
    /* 5.	Даны целые числа а1 ,а2 ,..., аn .
     Вывести на печать только те числа, для которых аi > i. */
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        //заполнние массива
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i)
                System.out.println(array[i]);;
        }
    }
}
