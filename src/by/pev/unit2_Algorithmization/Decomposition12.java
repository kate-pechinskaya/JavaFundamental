package by.pev.unit2_Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Decomposition12 {
    /*12.	Даны натуральные числа К и N. Написать метод(методы) формирования
     массива А, элементами которого являются числа,
     сумма цифр которых равна К и которые не большее N. */
    public static List array() {
        int k = 12;
        int n = 6;
        List a = new ArrayList();
        int m = 2;
        while (k != 1) {
            if (n >= k) {
                if (k % m == 0) {
                    k /= m;
                    a.add(m);
                } else if (m == 2) {
                    m++;
                } else {
                    m += 2;
                }
            }
            if (k > n) {
                k /= n;
                a.add(n);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(array());
    }
}
//работает не корректно с k>n