package by.pev.unit1_Basic;

public class CycleProgram5 {
    /* 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид: An = 1\2^n  + 1\*/
    public static void main(String[] args) {
        int n = 2;
        double a = 0;
        double e = 0.1;
        double ch;
        for (double i = 1.0; i < 20; i++) {
            ch = 1.0 / Math.pow(i, n);
            if (Math.abs(ch) >= e)
                a = a + (1.0 / Math.pow(i, n));
            else a = a + 0;
            // выводит все члены ряда
            System.out.println(ch);
            System.out.println();
        }
        //сумма чисел ряда, которые больше 'e'
        System.out.println(a);
    }
}
