package by.pev.unit1_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CycleProgram8 {
    /* 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 45;
        int b = 56;
        int[] result = new int[10];
        while (a != 0) {
            result[a % 10] = 1;
            a = a / 10;
        }
        while (b != 0) {
            int d = b % 10;
            result[d] = result[d] | 2;
            b = b / 10;
        }
        System.out.println("general figures: ");
        for (int d = 0; d < 10; d++) {
            if (result[d] == 3) System.out.print(d + "  ");
        }
    }
}


