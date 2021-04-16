package by.pev.unit1_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CycleProgram1 {
    /* 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.*/
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int result = 0;
            for (int i = 1; i <= n; i++) {
                result += i;
            }
            System.out.println(result);
        } else System.out.println("введено неверное число");
    }
}
