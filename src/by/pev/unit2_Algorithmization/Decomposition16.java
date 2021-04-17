package by.pev.unit2_Algorithmization;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.*;

public class Decomposition16 {
    /*16.	Написать программу, определяющую сумму n - значных чисел,
     содержащих только нечетные цифры. Определить также, сколько четных цифр
      в найденной сумме. Для решения задачи использовать декомпозицию. */
    public  static void sum(int n){
        List a= new ArrayList();
         // формирование массива n-значных чисел
        int sumNech = 0;
        int sumChet = 0;
        for (int j = (int) pow(10,n-1); j < pow(10,n); j++) {
            for (int i = 0; i < n; i++) {//для разделения числа на цифры
                if(j%2!=0) {//сделала на нечетные, а надо на все нечетные цифры
                    a.add(j);
                    sumNech += j;
                }
                else sumChet +=j;
            }
        }
        System.out.println(a);
        System.out.println("Сумма нечетных чисел: "+sumNech);
        System.out.println("Сумма нечетных чисел: "+sumChet);
    }

    public static void main(String[] args) {
    sum(2);
    }
}
