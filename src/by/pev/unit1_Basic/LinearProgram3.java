package by.pev.unit1_Basic;

import static java.lang.Math.*;

public class LinearProgram3 {
    /* 3. Вычислить значение выражения по формуле (все переменные
    принимают действительные значения):
    ((𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦))* 𝑡𝑔 𝑥y*/
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        System.out.println((sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y));
    }
}
