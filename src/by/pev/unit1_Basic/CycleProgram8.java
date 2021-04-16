package by.pev.unit1_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CycleProgram8 {
    /* 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int a_1 = Integer.parseInt(a);
        int b_1 = Integer.parseInt(b);
        String result = " ";
        for (int i = 1; i <= a.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == (a_1 % Math.pow(10, i))) {
                    result += j;
                }
            }
        }
        System.out.println("result: " + result);
    }
}


