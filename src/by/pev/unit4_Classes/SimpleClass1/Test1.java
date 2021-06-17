package by.pev.unit4_Classes.SimpleClass1;

public class Test1 {
    public static int a = 3;
    public static int b = 3;

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void print(){
        System.out.println(sum(a,b));
    }
}
