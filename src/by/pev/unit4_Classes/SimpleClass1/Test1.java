package by.pev.unit4_Classes.SimpleClass1;

public class Test1 {
    public static int a = 2;
    public static int b = 3;

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int edit(int a) {
        a = (int) (Math.random() * 10);
        return a;
    }

    public static int max(int a, int b) {
        a = edit(a);
        System.out.println("новое значение а: " + a);
        b = edit(b);
        System.out.println("новое значение b: " + b);
        int max;
        if (a >= b) {
            max = a;
        } else max = b;
        return max;
    }

    public static void print() {
        System.out.println("входные значения: " + a + ", " + b);
        System.out.println("сумма входных значений: " + sum(a, b));
        System.out.println("максимальное значение из 2 чисел: " + max(a, b));
    }
}
